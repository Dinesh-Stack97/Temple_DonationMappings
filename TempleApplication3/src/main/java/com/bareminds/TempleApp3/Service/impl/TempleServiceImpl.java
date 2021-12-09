package com.bareminds.TempleApp3.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp3.Exception.Spring_Boot_Apk_Exception;
import com.bareminds.TempleApp3.Repositery.DonationsRepository;
import com.bareminds.TempleApp3.Repositery.TempleRepository;
import com.bareminds.TempleApp3.Service.Temple_Service;
import com.bareminds.TempleApp3.dto.DonationReaquest;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;

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


//
//	@Override
//	public void deleteTempleById(long id) {
//		// TODO Auto-generated method stub
//		templeRepository.findById(id).orElseThrow(() -> new Spring_Boot_Apk_Exception("TemplePRofile", "id", id));
//		templeRepository.deleteById(id);
//	}




	@Override
	public List<Donations> getDonationByTemple(long id) {
		// TODO Auto-generated method stub
		templeRepository.findById(id).orElseThrow(()-> new Spring_Boot_Apk_Exception("Temple", "id", id));
	    return templeRepository.findDonationsBytemple(id);
		
	}




	@Override
	public void deleteTempleById(long id) {
		// TODO Auto-generated method stub
		templeRepository.deleteById(id);
		
	}




	@Override
	public Temple getTempByid(long id) {
		// TODO Auto-generated method stub
		return templeRepository.findTempleByID(id);
	}




	@Override
	public List<Temple> getTemplewithHall(int no_of_Halls) {
		// TODO Auto-generated method stub
		
		return templeRepository.findTempleByno_Of_Halls(no_of_Halls);
	}




	@Override
	public List<String> getTempleInfobyNo_Of_Halls(int no_of_Halls) {
		// TODO Auto-generated method stub
		 return templeRepository.findTempleInfobyNo_Of_Halls(no_of_Halls);
		
	}




	@Override
	public List<String> getDonationInfobyTempleId(long id) {
		// TODO Auto-generated method stub
		return donationRepository.findDonationInfobyTempleId(id);
	}




	@Override
	public long getCntAvgofdoantionsbyId(long id) {
		// TODO Auto-generated method stub
		return templeRepository.findCntAvgofdoantionsbyId(id);
	}




	@Override
	public List<Temple> getbytempleName(String templeName, Pageable pageable) {
		// TODO Auto-generated method stub
		pageable = PageRequest.of(0,10);
		return templeRepository.findbytempleName(templeName, pageable);
	}




//	@Override
//	public List<String> ProfitOfDonationCashByTemple(long id) {
//		// TODO Auto-generated method stub
//		return templeRepository.SumOfDonationCashByTemple(id);
//	}
	
	





	
	
}


