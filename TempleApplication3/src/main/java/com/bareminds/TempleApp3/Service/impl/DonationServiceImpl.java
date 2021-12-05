package com.bareminds.TempleApp3.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp3.Repositery.DonationsRepository;
import com.bareminds.TempleApp3.Service.DonationService;
import com.bareminds.TempleApp3.dto.AddDonations;
import com.bareminds.TempleApp3.models.Donations;

@Service
public class DonationServiceImpl  implements DonationService{
	
	@Autowired
	private DonationsRepository donationRepository;

	@Override
	public List<Donations> getAllDonations() {
		// TODO Auto-generated method stub
		return null;
	}

	
	


	public Donations SaveDonationById(long id, AddDonations donation) {
		// TODO Auto-generated method stub
		return donationRepository.save(donation.getDonation());
	}

	
	

	
}
