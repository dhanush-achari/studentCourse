package com.student.studentbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentbackend.model.Enrolled;
import com.student.studentbackend.model.Student;
import com.student.studentbackend.repository.EnrolledRepository;
import com.student.studentbackend.repository.StudentRepository;

@RestController
@RequestMapping("/home")
public class EnrolledController {
	
	@Autowired
	private EnrolledRepository enrolledRepository;
	
	
	@PostMapping("/enroll")
	public Enrolled enroll(@RequestBody Enrolled enrolled) {
		return enrolledRepository.save(enrolled);
	}
	
	

}
