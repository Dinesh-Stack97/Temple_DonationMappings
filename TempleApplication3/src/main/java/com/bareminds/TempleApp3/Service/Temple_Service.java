package com.bareminds.TempleApp3.Service;

import java.util.List;

import com.bareminds.TempleApp3.dto.DonationReaquest;
import com.bareminds.TempleApp3.models.Temple;


public interface Temple_Service {
	
	Temple SveTemple(DonationReaquest request);
	List<Temple> getAllTempleDetails();
	Temple getTempleById(long id);
	Temple updateTempleById(Temple temple, long id);
	void deleteTempleById(long id);
    
}
