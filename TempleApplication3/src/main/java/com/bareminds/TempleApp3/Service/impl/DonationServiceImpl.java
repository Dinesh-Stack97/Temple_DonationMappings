package com.bareminds.TempleApp3.Service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp3.Exception.Spring_Boot_Apk_Exception;
import com.bareminds.TempleApp3.Repositery.DonationsRepository;
import com.bareminds.TempleApp3.Repositery.TempleRepository;
import com.bareminds.TempleApp3.Service.DonationService;
import com.bareminds.TempleApp3.dto.AddDonations;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Land;
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
	
	

	
	


	public Donations SaveDonationById(long id, AddDonations donation) {
		// TODO Auto-generated method stub
		Temple temple = templeRepository.findById(id).orElse(null);
		
		return donationRepository.save(donation.getDonation());
	}

	@Override
	public List<Donations> findDonationByTemple(Long id) {
		// TODO Auto-generated method stub
		
		//Temple temple = templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
		System.out.println("Donations");
		return donationRepository.findDonationsByTempleId(id);
	}

	@Override
	public List<Land> landDonationsByTemple(long id) {
		// TODO Auto-generated method stub
		return donationRepository.LandDonationsByTemple(id);
	}

	@Override
	public List<Donations> getDonateBygroceriesName(String groceries, Pageable pageable) {
		// TODO Auto-generated method stub
		pageable=  PageRequest.of(0, 2, Direction.ASC, "groceries");
		return  donationRepository.DonationBygroceriesName(groceries, pageable);
	}

	public  Page<Donations> findDonations(int offset, int pagesize)
	{
		  Page<Donations> donation = donationRepository.findAll(PageRequest.of(offset, pagesize));
		  return donation;
	}

	







	@Override
	public Temple saveDonations(long id, Donations donation) {
		// TODO Auto-generated method stub
		Temple temple = templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
		temple.addDonation(donation);
		
		
		return  templeRepository.save(temple);
	}


	

//	public  Page<Donations> findDonationsByArea(int offset, int pagesize, String field)
//	{
//		  Page<Donations> donation = donationRepository.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(field)));
//		  return donation;
//	}
	
	

	




	
	

	
}
