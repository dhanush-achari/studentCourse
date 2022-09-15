package com.student.studentbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "coursename")
	private String coursename;

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public Course(){
		
	}

	public Course(int courseid, String description, String coursename) {
		super();
		this.courseid = courseid;
		this.description = description;
		this.coursename = coursename;
	}
	
	
		
}
