package com.jsp.hibernate.ManyToManyPractice;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	private int productId;
	private String ptoductName;

	@ManyToMany
	private List<Customer> customers = new ArrayList();

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPtoductName() {
		return ptoductName;
	}

	public void setPtoductName(String ptoductName) {
		this.ptoductName = ptoductName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
