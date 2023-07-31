package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import com.example.demo.sample4.*;

@SpringBootTest
public class Sample4Test {
  @Autowired
  Theater theater;
  
  @Test
  public void test1() {
    theater.play();
  }
}
