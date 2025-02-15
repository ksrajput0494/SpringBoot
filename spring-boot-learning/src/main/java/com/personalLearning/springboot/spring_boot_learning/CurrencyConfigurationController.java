package com.personalLearning.springboot.spring_boot_learning;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Create simple rest api
//this will return simple json with course id name author


@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses()
	{
		return configuration;
	}
	
	
}
