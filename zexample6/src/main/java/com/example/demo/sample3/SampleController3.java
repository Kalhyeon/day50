package com.example.demo.sample3;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//@RestController : 뷰가 아닌 데이터를 출력 (REST 방식)
@Controller // : MVC 와 REST 둘 다 가능
public class SampleController3 {
//  1. 메서드의 리턴 문자열이 JSP 의 이름
//  2. 주소와 JSP 의 이름이 같다면 void 처리
  
  @GetMapping("/sample3/test1")
  public void test1() {
  }
}
