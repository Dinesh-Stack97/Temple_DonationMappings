package com.bareminds.TempleApp4.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.bareminds.TempleApp4.models.Donar;
import com.bareminds.TempleApp4.models.Donations;
import com.bareminds.TempleApp4.models.Land;

public class AddDonations {
	

	

	private Donations donation;

	public AddDonations() {
		
		// TODO Auto-generated constructor stub
	}

	public AddDonations(Donations donation) {
		super();
		this.donation = donation;
	}

	public Donations getDonation() {
		return donation;
	}

	public void setDonation(Donations donation) {
		this.donation = donation;
	}
	
	

}
