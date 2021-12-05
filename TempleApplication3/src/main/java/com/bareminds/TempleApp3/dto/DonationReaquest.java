package com.bareminds.TempleApp3.dto;

import javax.annotation.sql.DataSourceDefinition;

import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;

public class DonationReaquest {
	
 private Temple temple;

public DonationReaquest() {
	
	// TODO Auto-generated constructor stub
}

public DonationReaquest(Temple temple) {
	super();
	this.temple = temple;
}

public Temple getTemple() {
	return temple;
}

public void setTemple(Temple temple) {
	this.temple = temple;
}
 
}

