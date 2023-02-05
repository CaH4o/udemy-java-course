package com.study.SpringBoot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBoot.courses.bean.Course;
import com.study.SpringBoot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository;

	// GET - All resurces
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return repository.findAll();
		// return Arrays.asList(new Course(1, "JAVA"), new Course(2, "SCSS"), new
		// Course(3, "C#"));
	}

	// GET - a single resource
	// http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public Course getSingleCourse(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);

		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}

		return course.get();
		// return new Course(1, "JAVA");
	}

	// POST - Create a new resource
	// http://localhost:8080/courses
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	// PUT - Update/Replace a resource
	// http://localhost:8080/courses/1
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course courseBody) {
		Optional<Course> course = repository.findById(id);

		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}

		repository.save(courseBody);
	}

	// DELETE
	// http://localhost:8080/courses/1
	@DeleteMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);

		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}

		repository.deleteById(id);
	}

}
