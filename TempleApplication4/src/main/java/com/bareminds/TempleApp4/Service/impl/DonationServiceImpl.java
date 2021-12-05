package com.bareminds.TempleApp4.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp4.Exception.Spring_Boot_Apk_Exception;
import com.bareminds.TempleApp4.Repositery.DonationsRepository;
import com.bareminds.TempleApp4.Repositery.TempleRepository;
import com.bareminds.TempleApp4.Service.DonationService;
import com.bareminds.TempleApp4.dto.AddDonations;
import com.bareminds.TempleApp4.models.Donations;
import com.bareminds.TempleApp4.models.Temple;

@Service
public class DonationServiceImpl  implements DonationService{
	
	@Autowired
	private DonationsRepository donationRepository;
	@Autowired
	private TempleRepository templeRepository;

	@Override
	public List<Donations> getAllDonations() {
		// TODO Auto-generated method stub
		return null;
	}

	




	@Override
	public void SaveDonationById(long id) {
		// TODO Auto-generated method stub
		Temple temp = templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
		
		temp.getDonations().add(new Donations());
	
        // donationRepository.addDonationsbyId(, groceries, Foundations, cash, OnlineDonations, foodAndHeritage, land, donar);
	}














	
	

	
}
