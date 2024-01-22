package com.jsp.hibernate.AssignmentLAZYLoadingManyToOne;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Students {
	@Id
	private int studentId;
	private String studentName;

	@ManyToOne(fetch = FetchType.LAZY)
	private Teacher teacher;

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", teacher=" + teacher + "]";
	}

}
