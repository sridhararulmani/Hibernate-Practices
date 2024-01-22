package com.jsp.hibernate.AsignmentLAZYLoadingInOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadar {
	@Id
	private int aadarId;
	private String aadarAddress;

	@OneToOne
	private Person person;

	public int getAadarId() {
		return aadarId;
	}

	public void setAadarId(int aadarId) {
		this.aadarId = aadarId;
	}

	public String getAadarAddress() {
		return aadarAddress;
	}

	public void setAadarAddress(String aadarAddress) {
		this.aadarAddress = aadarAddress;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Aadar [aadarId=" + aadarId + ", aadarAddress=" + aadarAddress + ", person=" + person + "]";
	}
	

}
