package com.study.SpringBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.SpringBoot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
