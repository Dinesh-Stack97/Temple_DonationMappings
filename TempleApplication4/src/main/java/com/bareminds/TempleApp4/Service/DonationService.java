package com.bareminds.TempleApp4.Service;

import java.util.List;

import com.bareminds.TempleApp4.dto.AddDonations;
import com.bareminds.TempleApp4.models.Donations;

public interface DonationService {
	
	List<Donations> getAllDonations();
	//void SaveDonationById(Donations donation);
	void SaveDonationById(long id);
	
	


	//void addDonationsbyId(long id);

}
