package com.personalLearning.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.personalLearning.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String insertQuery=
			"""
			insert into course(id,name,author) 
			values (?,?,?);
			""";
	
	private static String deleteQuery =
			"""
			delete from course where id = ?
			""";
	private static String select_Query =
			"""
			select * from course where id = ?
			""";
	
	
	public void insert(Course course) {
		springJdbcTemplate.update(insertQuery,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void deleteById(long id)
	{
		springJdbcTemplate.update(deleteQuery,id);
	}
	public Course findById(long id) 
	{
		//ResultSet -> Bean => Row Mapper =>
		return springJdbcTemplate.queryForObject(select_Query, new BeanPropertyRowMapper<>(Course.class),id);
	}

}
