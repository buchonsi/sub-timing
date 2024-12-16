package com.yoon.subwaytiming.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SubwayServiceTest.class})
class SubwayServiceTest {

}

//JUnit 5를 이용하여 Spring Boot 애플리케이션의 테스트 코드를 작성할 때, 각 레이어(controller, service, repository)에 대한 테스트 작성법을 이해하는 것이 중요합니다. 각 레이어는 서로 다른 역할을 하며, 각각에 대해 적절한 테스트를 작성해야 합니다.
//
//1. Controller 테스트
//Controller 테스트는 일반적으로 Spring의 @WebMvcTest 어노테이션을 사용합니다. MockMvc를 사용하여 HTTP 요청을 시뮬레이션하고, 컨트롤러의 동작을 검증합니다.
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//@WebMvcTest(MyController.class)
//public class MyControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private MyService myService;
//
//    @Test
//    public void testGetEndpoint() throws Exception {
//        mockMvc.perform(get("/api/resource"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("test"));
//    }
//}
//2. Service 테스트
//Service 테스트는 일반적으로 @ExtendWith(SpringExtension.class)와 @SpringBootTest 어노테이션을 사용합니다. 필요한 경우 @MockBean을 사용하여 서비스 클래스가 의존하는 다른 빈을 모킹할 수 있습니다.
//
//import static org.mockito.Mockito.when;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//public class MyServiceTest {
//
//    @Mock
//    private MyRepository myRepository;
//
//    @InjectMocks
//    private MyService myService;
//
//    @Test
//    public void testServiceMethod() {
//        when(myRepository.findById(1L)).thenReturn(Optional.of(new MyEntity(1L, "test")));
//
//        MyEntity result = myService.findById(1L);
//        assertEquals("test", result.getName());
//    }
//}
//3. Repository 테스트
//Repository 테스트는 데이터베이스와의 상호작용을 검증하는 것으로, @DataJpaTest 어노테이션을 사용합니다. 이는 엔티티 매핑 및 데이터베이스 동작을 테스트하는 데 유용합니다.
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//@DataJpaTest
//public class MyRepositoryTest {
//
//    @Autowired
//    private MyRepository myRepository;
//
//    @Test
//    public void testFindById() {
//        MyEntity entity = new MyEntity(1L, "test");
//        myRepository.save(entity);
//
//        MyEntity result = myRepository.findById(1L).orElse(null);
//        assertEquals("test", result.getName());
//    }
//}
//
//요약
//Controller 테스트: @WebMvcTest와 MockMvc를 사용하여 HTTP 요청을 시뮬레이션하고 컨트롤러의 동작을 검증합니다.
//Service 테스트: @SpringBootTest와 @MockBean을 사용하여 서비스 클래스의 비즈니스 로직을 검증합니다.
//Repository 테스트: @DataJpaTest를 사용하여 데이터베이스와의 상호작용을 검증합니다.
//각 레이어에 맞는 적절한 테스트를 작성함으로써 애플리케이션의 안정성과 신뢰성을 높일 수 있습니다. 추가적인 질문이나 도움이 필요하시면 언제든지 말씀해 주세요!