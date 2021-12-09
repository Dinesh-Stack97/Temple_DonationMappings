package com.bareminds.TempleApp3.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Land")
public class Land {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int landId;
	
	@Column(name="AreainSqrFeet")
	private String Area;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="LandType")
	private String landtype;


	@ManyToOne
	
	private Donations donation;
	public Land() {
		
		// TODO Auto-generated constructor stub
	}
	public Land(int landId, String area, String address, String landtype, Donations donation) {
		super();
		this.landId = landId;
		Area = area;
		Address = address;
		this.landtype = landtype;
		this.donation = donation;
	}
	public int getLandId() {
		return landId;
	}
	public void setLandId(int landId) {
		this.landId = landId;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLandtype() {
		return landtype;
	}
	public void setLandtype(String landtype) {
		this.landtype = landtype;
	}
	public Donations getDonation() {
		return donation;
	}
	public void setDonation(Donations donation) {
		this.donation = donation;
	}

	
}
