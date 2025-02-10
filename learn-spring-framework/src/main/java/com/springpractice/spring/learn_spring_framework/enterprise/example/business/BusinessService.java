package com.springpractice.spring.learn_spring_framework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springpractice.spring.learn_spring_framework.enterprise.example.data.DataService;

@Component
public class BusinessService
{
	//Constructor Injection   <--- This here is best and recommended
//	public BusinessService(DataService dataService) {
//		super();
//		System.out.println("Constructor Injection");
//		this.dataService = dataService;
//	}
	
	//Setter Based Injection 
//	public void setDataService(DataService dataService) {
//		System.out.println("Setter Based Injection");
//		this.dataService = dataService;
//	}	
	
	
	
	//Filed Injection Example
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}




	
}


