package com.bareminds.TempleApp3.controller;

import java.util.Collection;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bareminds.TempleApp3.Repositery.DonationsRepository;
import com.bareminds.TempleApp3.Service.DonationService;
import com.bareminds.TempleApp3.Service.Temple_Service;
import com.bareminds.TempleApp3.dto.APIResponse;
import com.bareminds.TempleApp3.dto.AddDonations;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Land;
import com.bareminds.TempleApp3.models.Temple;

import io.swagger.annotations.ApiResponse;
@RestController
public class DonationController {
	
	@Autowired
	private DonationService donationService;
	
	@Autowired
	private Temple_Service temple_Service;
	
	private DonationsRepository donationRepository;
	
	@GetMapping("/Donations")
	public List<Donations> getDonations()
	{
		return donationService.getAllDonations();
	}
	
	@PostMapping("/saveDonation/{id}")
	public Donations SaveDonation(@PathVariable long id,@RequestBody Donations donation)
	{
		
		
		return donationService.saveDonations(id, donation);
		
		
	}
	
	@GetMapping("/donations/temple/{id}")
	public @ResponseBody List<Donations> findDonationByTemple(@PathVariable("id") Long id)
	{
		return donationService.findDonationByTemple(id);
	}
	

	@PostMapping("/add/{id}")
	public Donations addDonations(@PathVariable("id")long id,@RequestBody Donations donations)
	{
		return donationService.saveDonations(id, donations);
	

}
	@GetMapping("GetDonation/Temple/{id}")
	public List<String> findDonationInfobyTempleId(@PathVariable("id") long id) {
		
	
	
		return temple_Service.getDonationInfobyTempleId(id);
	}
	
	@GetMapping("Temple/Donation/land/{id}")
	public 	List<Land> PropertydDonationsByTemple(@PathVariable("id") long id)
	{
		return donationService.landDonationsByTemple(id);
	}
	
	
	@GetMapping("Donations/groceries/{groceries}")
	public List<Donations> getDonateBygroceriesName(@PathVariable("groceries") String groceries, Pageable pageable) {
		return donationService.getDonateBygroceriesName(groceries, pageable);
	}
	
	@GetMapping("/Temple/donation/{offset}/{pagesize}")
	private APIResponse<Page<Donations>> getDonationsByArea(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize)
	{
		Page<Donations> donationwithpagination = donationService.findDonations(offset, pagesize);
		return new APIResponse<>(donationwithpagination.getSize(),donationwithpagination);
		
	}
	@GetMapping("/pageable")
	public Page<Donations> retriveDonationswithPaging(@Param(value="page") int page,@Param(value="size") int size)
	{
		Pageable requestedPage = PageRequest.of(page, size);
		Page<Donations> donations = donationRepository.findAll(requestedPage);
		
		return donations;
	}
	@GetMapping("/donation/cash/{cash}")
  public Slice<Donations> retriveDonationsById(@PathVariable(value="cash")double  cash,
		                                        @Param(value="page")int page,
		                                        @Param(value="size") int size){
	  Pageable requestedPage = PageRequest.of(page, size);
	   return donationRepository.findAllBycash(cash, requestedPage);
	 
	  
  }
	@GetMapping("donation/recordsafter/id")
	public Slice<Donations> retrivebyIdgreaterthan(@Param(value="id") int donationId,
			                                        @Param(value="page")int page,
			                                        @Param(value="size") int size){
		Pageable requestedPage = PageRequest.of(page, size);
		return donationRepository.findAllByDonationId(donationId, requestedPage);
		
	}
	
}
