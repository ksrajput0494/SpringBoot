package com.personalLearning.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.personalLearning.springboot.learn_jpa_and_hibernate.course.Course;
import com.personalLearning.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.personalLearning.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.personalLearning.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		repository.insert(new Course(1,"Learn Spring Boot","Kuldeep Singh"));
//		repository.insert(new Course(2,"Learn Spring Boot JPA","Kuldeep Singh"));
//		repository.insert(new Course(3,"Learn Spring Boot Starter","Kuldeep Singh"));
//		repository.insert(new Course(4,"Learn Spring Boot Hybernate","Kuldeep Singh"));
//		repository.deleteById(3);
//		System.out.println(repository.findById(2));
//		System.out.println(repository.findById(1));
		
		repository.save(new Course(1,"Learn Spring Boot","Kuldeep Singh"));
		repository.save(new Course(2,"Learn Spring Boot JPA","Kuldeep Singh"));
		repository.save(new Course(3,"Learn Spring Boot Starter","Kuldeep Singh"));
		repository.save(new Course(4,"Learn Spring Boot Hybernate","Kuldeep Singh"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(1l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Kuldeep Singh"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Spring Boot JPA"));
		System.out.println(repository.findByName(""));
		
	}

}
