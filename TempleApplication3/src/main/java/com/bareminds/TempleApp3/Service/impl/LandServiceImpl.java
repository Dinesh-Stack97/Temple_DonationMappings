package com.bareminds.TempleApp3.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp3.Repositery.LandRepository;
import com.bareminds.TempleApp3.Service.landservice;
import com.bareminds.TempleApp3.models.Land;

@Service
public class LandServiceImpl implements landservice {
	
	@Autowired
	LandRepository landRepository;

	@Override
	public List<String> DonationBylandtype(String landtype) {
		// TODO Auto-generated method stub
		return landRepository.findDonationBylandtype(landtype);
	}
	
	

}
