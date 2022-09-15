package com.student.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentbackend.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}


