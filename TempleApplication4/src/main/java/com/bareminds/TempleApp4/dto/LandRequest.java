package com.bareminds.TempleApp4.dto;

import com.bareminds.TempleApp4.models.Donations;

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
