package com.jsp.hibernate.todaProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persion {
	@Id
	private int pId;
	private String pName;
	private int pContact;
	
	@OneToOne
	private Pan pan;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpContact() {
		return pContact;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	public void setpContact(int pContact) {
		this.pContact = pContact;
	}

	@Override
	public String toString() {
		return "Persion [pId=" + pId + ", pName=" + pName + ", pContact=" + pContact + "]";
	}

}
