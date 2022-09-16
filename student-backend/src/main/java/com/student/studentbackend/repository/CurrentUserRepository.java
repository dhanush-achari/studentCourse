package com.student.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentbackend.model.CurrentUser;

public interface CurrentUserRepository extends JpaRepository<CurrentUser, Integer>{
	
}
