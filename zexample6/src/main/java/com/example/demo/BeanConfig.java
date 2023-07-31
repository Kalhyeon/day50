package com.example.demo;

import org.springframework.context.annotation.*;

import com.example.demo.sample2.*;

// 수동으로 빈 등록 : Inversion of Control
@Configuration
public class BeanConfig {
  @Bean // 스프링 빈이 되어 스프링 컨테이너에 등록된다.
  Phone phone() {
    return new Phone();
  }
  
  @Bean
  Student student() {
    return new Student();
  }
}
