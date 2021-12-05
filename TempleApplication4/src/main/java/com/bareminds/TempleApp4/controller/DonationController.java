package com.bareminds.TempleApp4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bareminds.TempleApp4.Service.DonationService;
import com.bareminds.TempleApp4.Service.Temple_Service;
import com.bareminds.TempleApp4.dto.AddDonations;
import com.bareminds.TempleApp4.models.Donations;
import com.bareminds.TempleApp4.models.Temple;

@RestController
public class DonationController {

	@Autowired
	private DonationService donationService;
	@Autowired
	private Temple_Service trmpleService;
	@GetMapping("/Donations")
	public List<Donations> getDonations()
	{
		return donationService.getAllDonations();
	}
	
	@PostMapping("/saveDonation/{id}")
	public void SaveDonation(@PathVariable long id,@RequestBody Donations donation)
	{
		
		
		donationService.SaveDonationById(id);
		
		
	}
	@PostMapping("{id}")
	public void SaveDonationById(@PathVariable long id)
	{
		donationService.SaveDonationById(id);
	}

}
 
