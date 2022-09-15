package com.student.studentbackend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentbackend.exception.ResourceNotFoundException;
import com.student.studentbackend.model.Course;
import com.student.studentbackend.model.Student;
import com.student.studentbackend.repository.CourseRepository;;


@RestController
@RequestMapping("/home")
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}	
	

}
