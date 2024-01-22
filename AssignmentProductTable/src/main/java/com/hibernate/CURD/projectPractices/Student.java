package com.hibernate.CURD.projectPractices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student Table")
public class Student {
	@Id
	@Column(name = "Student Id")
	private int sId;
	@Column(name = "Student Name")
	private String sName;
	@Column(name = "Student Email")
	private String sEmail;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	@Override
	public String toString(){
		return sId+" "+sName+" "+sEmail;
	}
}