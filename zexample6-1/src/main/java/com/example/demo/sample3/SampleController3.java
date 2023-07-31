package com.example.demo.sample3;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

//@RestController : 뷰가 아닌 데이터를 출력 (REST 방식)
@Controller // : MVC 와 REST 둘 다 가능
public class SampleController3 {
//  1. 메서드의 리턴 문자열이 JSP 의 이름
//  2. 주소와 JSP 의 이름이 같다면 void 처리
  
  @GetMapping("/sample3/test1")
  public void test1() {
  }
  
  @GetMapping("/sample3/test2")
  public void test2(Model model) {
//    서블릿의 request.setAttribute() 와 마찬가지
    model.addAttribute("username", "홍길동");
  }
  
  @GetMapping("/sample3/test3")
  public void test3(Model model) {
    model.addAttribute("username", "홍길동");
  }
  
  @GetMapping("/sample3/test4")
  public void test4(Model model) {
    model.addAttribute("username", "홍길동");
  }
  
  @GetMapping("/sample3/test5")
  public void test5(Model model) {
    List<String> list = new ArrayList<>();
    for(int i=0; i<10; i++) {
      list.add(i+"번째 문자열");
    }
    model.addAttribute("list", list);
  }
}
