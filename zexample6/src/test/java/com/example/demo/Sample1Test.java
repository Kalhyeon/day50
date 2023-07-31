package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

// import static 은 정적 메서드 import
import com.example.demo.sample1.room.*;


@SpringBootTest
public class Sample1Test {
  @Autowired
  A타입원룸 room;
  
  @Test
  public void roomIsNotnullTest() {
    assertNotNull(room);
  }
}