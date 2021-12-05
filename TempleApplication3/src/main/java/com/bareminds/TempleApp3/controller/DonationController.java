package com.bareminds.TempleApp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bareminds.TempleApp3.Service.DonationService;
import com.bareminds.TempleApp3.dto.AddDonations;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;

@RestController
public class DonationController {
	
	@Autowired
	private DonationService donationService;
	
	@GetMapping("/Donations")
	public List<Donations> getDonations()
	{
		return donationService.getAllDonations();
	}
	
	@PostMapping("/saveDonation/{id}")
	public Donations SaveDonation(@PathVariable long id,@RequestBody AddDonations donation)
	{
		
		
		return donationService.SaveDonationById(id, donation);
		
		
	}

}
