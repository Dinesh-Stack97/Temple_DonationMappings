package com.bareminds.TempleApp3.dto;

import com.bareminds.TempleApp3.models.Donations;

public class LandRequest {
	
	private Donations donation;

	public LandRequest() {
		
		// TODO Auto-generated constructor stub
	}

	public LandRequest(Donations donation) {
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
