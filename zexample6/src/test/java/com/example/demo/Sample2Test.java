package com.example.demo;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import com.example.demo.sample2.*;

@SpringBootTest
public class Sample2Test {
  @Autowired
  Student student;
  
  @Test
  public void nullTest() {
    assertNotNull(student);
  }
}
