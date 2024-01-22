package com.jsp.hibernate.AsignmentLAZYLoadingInOneToOne;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", aadar=" + aadar + "]";
	}

	@Id
	private int personId;
	private String personName;

	@OneToOne(fetch = FetchType.LAZY)
	private Aadar aadar;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Aadar getAadar() {
		return aadar;
	}

	public void setAadar(Aadar aadar) {
		this.aadar = aadar;
	}

}
