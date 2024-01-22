package com.jsp.hibernate.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int personId;
	private String personName;
	private int personContact;

	@OneToMany(fetch = FetchType.EAGER)
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public int getPersonId() {
		return personId;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personContact=" + personContact
				+ ", vehicles=" + vehicles + "]";
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

	public int getPersonContact() {
		return personContact;
	}

	public void setPersonContact(int personContact) {
		this.personContact = personContact;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
