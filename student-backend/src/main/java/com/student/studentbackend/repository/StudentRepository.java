package com.student.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentbackend.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
