package com.springpractice.spring.learn_spring_framework.enterprise.example.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springpractice.spring.learn_spring_framework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	@Autowired
	private BusinessService businessService;
	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}

