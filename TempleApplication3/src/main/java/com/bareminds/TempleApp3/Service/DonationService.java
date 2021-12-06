package com.bareminds.TempleApp3.Service;

import java.util.Collection;
import java.util.List;

import com.bareminds.TempleApp3.dto.AddDonations;
import com.bareminds.TempleApp3.models.Donations;

public interface DonationService {
	
	List<Donations> getAllDonations();
	Donations SaveDonationById(long id,AddDonations donation);
	//Donations SaveDonationById(long id, Donations donation);
	Donations saveDonations(long id, Donations donation);
	
	//void addDonationsbyId(int id);
	List<Donations> findDonationByTemple(Long id);
}
