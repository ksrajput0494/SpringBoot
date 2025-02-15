package com.personalLearning.springboot.spring_boot_learning;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Create simple rest api
//this will return simple json with course id name author


@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses()
	{
		return Arrays.asList(
				new Course(1, "Learn AWS", "CourseEra"),
				new Course(2, "Learn Azure", "CourseEra"),
				new Course(3, "Learn GCP", "CourseEra"),
				new Course(4, "Devtools", "CourseEra")
				);
	}
	
	
}
