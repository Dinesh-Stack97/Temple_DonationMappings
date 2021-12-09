package com.bareminds.TempleApp3.dto;

import com.bareminds.TempleApp3.models.Utencils;

public class AddUtencils {
	
	private Utencils utensils;

	public AddUtencils() {
		
		// TODO Auto-generated constructor stub
	}

	public AddUtencils(Utencils utensils) {
		super();
		this.utensils = utensils;
	}

	public Utencils getUtensils() {
		return utensils;
	}

	public void setUtensils(Utencils utensils) {
		this.utensils = utensils;
	}
	
	

}
