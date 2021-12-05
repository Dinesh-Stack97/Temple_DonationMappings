package com.bareminds.TempleApp4.Service;

import java.util.List;

import com.bareminds.TempleApp4.dto.DonationReaquest;
import com.bareminds.TempleApp4.models.Temple;


public interface Temple_Service {
	
	Temple SveTemple(DonationReaquest request);
	List<Temple> getAllTempleDetails();
	Temple getTempleById(long id);
	Temple updateTempleById(Temple temple, long id);
	void deleteTempleById(long id);
	void SaveDonationById(long id);
    
}
