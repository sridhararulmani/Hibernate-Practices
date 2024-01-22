package com.jsp.hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;

	/**
	 * if we mappedBy Uni-Directional means we have to give the same Class referance
	 * what we given in the another class We have to give the reff in its own Same
	 * class. then it will cretate only 3 tables in database
	 */

	/**
	 * if we want to do Bi-Directional no need to pass mapped by its automaticaly
	 * take the both tables P.K and make a table it will store the p.K as f.k
	 */
	/**
	 * where we pass the mappedby that class is the owner class. That another Class
	 * is Associated class
	 */

	 @ManyToMany
	private List<Course> course = new ArrayList();

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

//	public List<Course> getCourse() {
//		return course;
//	}
//
//	public void setCourse(List<Course> course) {
//		this.course = course;
//	}

}
