package com.jsp.hibernate.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private int vehicleId;
	private String vehicleName;
	private int vehicleCost;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getVehicleCost() {
		return vehicleCost;
	}

	public void setVehicleCost(int vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleCost=" + vehicleCost
				+ "]";
	}
	
}
