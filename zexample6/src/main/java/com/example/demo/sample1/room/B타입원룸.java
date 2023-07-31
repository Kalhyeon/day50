package com.example.demo.sample1.room;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.example.demo.sample1.component.*;

@Component
public class B타입원룸 {
	@Autowired
	private TV tv;
	@Autowired
	private 냉장고 ref;
	@Autowired
	private 세탁기 was;
	@Autowired
	private 전자렌지 micro;
}
