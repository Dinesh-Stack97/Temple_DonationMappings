package com.bareminds.TempleApp3.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;


import com.bareminds.TempleApp3.dto.AddDonations;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Land;
public interface DonationService {
	
	List<Donations> getAllDonations();
	//Donations SaveDonationById(long id,Donations donation);
	//Donations SaveDonationById(long id, Donations donation);
	Donations saveDonations(long id, Donations donation);
	
	//void addDonationsbyId(int id);
	List<Donations> findDonationByTemple(Long id);
	

	List<Land> landDonationsByTemple(long id);
	
	List<Donations> getDonateBygroceriesName(String groceries, Pageable pageable);
	
	 Page<Donations> findDonations(int offset, int pagesize);
	 
	// Page<Donations> findDonationsByArea(int offset, int pagesize, String field);
	
	
}

