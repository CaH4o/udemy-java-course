package com.study.SpringBoot.courese.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBoot.courese.bean.Course;

@RestController
public class CourseController {

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "JAVA"), new Course(2, "SCSS"), new Course(3, "C#"));
	}

	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getSingleCourse() {
		return new Course(1, "JAVA");
	}
}
