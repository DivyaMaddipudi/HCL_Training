package com.mapping.one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "p_table_one2one_uni")
public class Parking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partingId;
	private String parkingLocation;
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
	public Parking( String parkingLocation) {
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
