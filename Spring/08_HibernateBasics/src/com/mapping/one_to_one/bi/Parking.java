package com.mapping.one_to_one.bi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "p_table_one2one_bi")
public class Parking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partingId;
	private String parkingLocation;
	
	@JoinColumn(name = "eid_fk")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Employee employee;

	public int getPartingId() {
		return partingId;
	}

	public void setPartingId(int partingId) {
		this.partingId = partingId;
	}

	public String getParkingLocation() {
		return parkingLocation;
	}

	public void setParkingLocation(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Parking(String parkingLocation) {
		super();
		this.parkingLocation = parkingLocation;
	}

	public Parking() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parking [partingId=");
		builder.append(partingId);
		builder.append(", parkingLocation=");
		builder.append(parkingLocation);
		
		builder.append("]");
		return builder.toString();
	}
	
}
