package com.student.studentbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentbackend.model.CurrentUser;
import com.student.studentbackend.model.Student;
import com.student.studentbackend.repository.CurrentUserRepository;

@RestController
@RequestMapping("/")
public class CurrentUserController {

	@Autowired
	private CurrentUserRepository currentUserRepository;

	@PostMapping("/login")
	public CurrentUser login(@RequestBody CurrentUser currentUser) {

		return currentUserRepository.save(currentUser);

	}
	
	@DeleteMapping("/signout")
    public String deletePost() {
		
		currentUserRepository.deleteAll();
		return null;
		
    }

}
