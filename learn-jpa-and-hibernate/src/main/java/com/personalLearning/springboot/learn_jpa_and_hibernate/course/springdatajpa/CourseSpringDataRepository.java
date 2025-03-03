package com.personalLearning.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalLearning.springboot.learn_jpa_and_hibernate.course.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
