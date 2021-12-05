package com.bareminds.TempleApp4.models;

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


	public Land() {
		
		// TODO Auto-generated constructor stub
	}


	public Land( String area, String address, String landtype) {
		super();
		
		Area = area;
		Address = address;
		this.landtype = landtype;
	}




	public String getArea() {
		return Area;
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


	
}
