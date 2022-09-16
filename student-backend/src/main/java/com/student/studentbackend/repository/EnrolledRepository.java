package com.student.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.student.studentbackend.model.Enrolled;

public interface EnrolledRepository extends JpaRepository<Enrolled, Integer> {

}
