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
import com.student.studentbackend.model.Student;
import com.student.studentbackend.repository.StudentRepository;

@RestController
@RequestMapping("/home")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@PostMapping("/addstudent")
	public Student createStudet(@RequestBody Student student) {
		return studentRepository.save(student);
	}
}
