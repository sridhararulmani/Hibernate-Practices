package com.jsp.hibernate.AssignmentLAZYLoadingManyToOne;

//import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	private int teacherId;
	private String teacherName;

//	@OneToMany
//	private List<Students> students = new ArrayList();

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + "]";
	}
	

//	public List<Students> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Students> students) {
//		this.students = students;
//	}

}
