package com.bareminds.TempleApp4.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp4.Exception.Spring_Boot_Apk_Exception;
import com.bareminds.TempleApp4.Repositery.DonationsRepository;
import com.bareminds.TempleApp4.Repositery.TempleRepository;
import com.bareminds.TempleApp4.Service.Temple_Service;
import com.bareminds.TempleApp4.dto.DonationReaquest;
import com.bareminds.TempleApp4.models.Donations;
import com.bareminds.TempleApp4.models.Temple;

@Service
public class TempleServiceImpl implements Temple_Service{
	
	@Autowired
	private TempleRepository templeRepository;
	
	@Autowired
	private DonationsRepository donationRepository;

    


	public List<Temple> getAllTempleDetails() {
		// TODO Auto-generated method stub
		return templeRepository.findAll();
	}



	
	public Temple SveTemple(DonationReaquest request) {
		// TODO Auto-generated method stub
		
	
		return templeRepository.save(request.getTemple());
	}
	
	@Override
	public void SaveDonationById(long id) {
	   
		Temple temp = templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
		temp.getDonations().add(new Donations());
		
	}




	public Temple getTempleById(long id) {
		// TODO Auto-generated method stub
		return templeRepository.findById(id).orElseThrow(() -> new Spring_Boot_Apk_Exception("TempleProfile", "id", id));
	}



	@Override
	public Temple updateTempleById(Temple temple, long id) {
		// TODO Auto-generated method stub
		Temple ExixstingTemplePrrofile = templeRepository.findById(id).orElseThrow(() -> new Spring_Boot_Apk_Exception("TempleProfile", "id", id));
		ExixstingTemplePrrofile.setTempleName(temple.getTempleName());
	
		ExixstingTemplePrrofile.setRevenue(temple.getRevenue());
	

		ExixstingTemplePrrofile.setEmail(temple.getEmail());

		ExixstingTemplePrrofile.setExpences(temple.getExpences());
		
	
		ExixstingTemplePrrofile.setPriestName(temple.getPriestName());
		ExixstingTemplePrrofile.setPhoneNumber(temple.getPhoneNumber());
		templeRepository.save(ExixstingTemplePrrofile);
		return  ExixstingTemplePrrofile;
	}



	@Override
	public void deleteTempleById(long id) {
		// TODO Auto-generated method stub
		templeRepository.findById(id).orElseThrow(() -> new Spring_Boot_Apk_Exception("TemplePRofile", "id", id));
		templeRepository.deleteById(id);
	}

}
