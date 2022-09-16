package com.student.studentbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enrolled")
public class Enrolled {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	@Column(name = "studentname")
	private String studentname;
	
	@Column(name = "courseid")
	private int courseid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public Enrolled(int eid, String studentname, int courseid) {
		super();
		this.eid = eid;
		this.studentname = studentname;
		this.courseid = courseid;
	}

	public Enrolled() {
		
		// TODO Auto-generated constructor stub
	}

	
	
	
}
