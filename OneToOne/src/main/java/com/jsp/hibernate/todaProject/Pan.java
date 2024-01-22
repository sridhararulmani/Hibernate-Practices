package com.jsp.hibernate.todaProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
	private int panId;
	private String panCity;
	private int panNumber;
	
	@OneToOne
	private Persion p;

	public Persion getP() {
		return p;
	}

	public void setP(Persion p) {
		this.p = p;
	}

	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanCity() {
		return panCity;
	}

	public void setPanCity(String panCity) {
		this.panCity = panCity;
	}

	public int getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}

	@Override
	public String toString() {
		return "Pan [panId=" + panId + ", panCity=" + panCity + ", panNumber=" + panNumber + "]";
	}

}
