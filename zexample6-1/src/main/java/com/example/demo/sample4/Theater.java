package com.example.demo.sample4;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import lombok.extern.slf4j.*;

// 롬복이 SLF4J 객체 log 를 주입해준다.
@Slf4j
@Component
public class Theater {
//  @Value : 값을 주입하는 어노테이션
//  @Autowired : 객체를 주입하는 어노테이션
//  작품명
  @Value("We're Friend")
  private String name;
  
//  JSP EL, Spring EL, Spring Security EL
//  EL 이긴 하나, Spring EL 이다.
  @Value("${musical.price}")
  private Long price;
  
  public Theater() {
//    생성자는 프레임워크가 사용한다 => 개발자 사용 금지
  }
  
  @PostConstruct
  public void on() {
    log.info("공연 시작합니다, 자리에 앉아주세요.");
  }
  
  public void play() {
    log.info("{} 공연을 시작합니다.", name);
    log.info("{}원 {}을 시작합니다.", price, name);
  }
  
  @PreDestroy
  public void off() {
    log.info("공연이 끝났습니다, 감사합니다.");
  }
}
