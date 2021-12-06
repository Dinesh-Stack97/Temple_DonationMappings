package com.bareminds.TempleApp3.Service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp3.Exception.Spring_Boot_Apk_Exception;
import com.bareminds.TempleApp3.Repositery.DonationsRepository;
import com.bareminds.TempleApp3.Repositery.TempleRepository;
import com.bareminds.TempleApp3.Service.DonationService;
import com.bareminds.TempleApp3.dto.AddDonations;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;

@Service
public class DonationServiceImpl  implements DonationService{
	
	@Autowired
	private DonationsRepository donationRepository;
	
	private TempleRepository templeRepository;

	@Override
	public List<Donations> getAllDonations() {
		// TODO Auto-generated method stub
		return donationRepository.findAll();
	}
	
	public Donations saveDonations(long id, Donations donation)
	{
		Temple temple = templeRepository.findById((long) donation.getDonationId()).orElse(null);
		temple.addDonation(donation);
		
		
		return  donationRepository.save(donation);
	}

	
	


	public Donations SaveDonationById(long id, AddDonations donation) {
		// TODO Auto-generated method stub
		Temple temple = templeRepository.findById(id).orElse(null);
		
		return donationRepository.save(donation.getDonation());
	}

	@Override
	public List<Donations> findDonationByTemple(Long id) {
		// TODO Auto-generated method stub
		//Temple temple = templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
		return donationRepository.findDonationsByTempleId(id);
	}






	
	

	
}
