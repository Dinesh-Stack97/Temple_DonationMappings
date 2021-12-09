package com.bareminds.TempleApp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bareminds.TempleApp3.Service.Temple_Service;
import com.bareminds.TempleApp3.dto.DonationReaquest;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;
//@restcontroller uses these two annotations internally
//@Controller-->To make normal java class has a spring mvc class so that it handle web request
//@ResponseBody             The rest apis should return jason or xml or other format
@RestController
@RequestMapping("/api/temple")
public class TempleAppController {
	
	@Autowired
	private Temple_Service temple_Service;
	
	
	
	


	public TempleAppController(Temple_Service temple_Service) {
		super();
		this.temple_Service = temple_Service;
	}

   @PostMapping("/saveTemple")
   public Temple SaveTempleProfile(@RequestBody DonationReaquest request)
   {
	   return temple_Service.SveTemple(request);
   }



	@GetMapping("/temples")
	public List<Temple> getTempleProfiles()
	{
		return temple_Service.getAllTempleDetails();
	}
	
	@GetMapping("{id}")
	public Temple GettempleById(@PathVariable("id") long id)
	{
		return temple_Service.getTempleById(id);
	}
	@PutMapping("{id}")
	public Temple UpdateTempleById(@RequestBody Temple temple,@PathVariable("id") long id)
	{
	        return temple_Service.updateTempleById(temple, id);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> DeleteTempleById(@PathVariable("id") long id)
	{
		temple_Service.deleteTempleById(id);
		return new ResponseEntity<String>("Temple Profile Deleted Successfully",HttpStatus.OK);
	}
	
	@GetMapping("getDonation/temple/{id}")
	public @ResponseBody List<Donations> getDonationBytemple(@PathVariable("id") long id)
	{
		System.out.println("donations");
		 return temple_Service.getDonationByTemple(id);
		
	}
	
	@GetMapping("GetTemple/{id}")
	public  Temple geTemplebyTempleId(@PathVariable("id") long id)
	{
		return temple_Service.getTempByid(id);
	}
	
	@GetMapping("GetTemple/no of halls/{no_of_halls}")
	public List<Temple> getTempleByHslls(@PathVariable("no_of_halls")int  no_of_Halls)
	{
		return temple_Service.getTemplewithHall(no_of_Halls);
	}
	
	@GetMapping("GetTemple/halls/{halls}")
	public List<String> getTempleInfo_by_hall(@PathVariable("halls")int  no_of_Halls)
	{
		return temple_Service.getTempleInfobyNo_Of_Halls(no_of_Halls);
	}
	
	@GetMapping("Count/avg/donation/{id}")
	public long getcntAvgofdoantionsbyId(@PathVariable("id") long id) {
		return temple_Service.getCntAvgofdoantionsbyId(id);
	}
	
//	@GetMapping("profit/donation/temple/{id}")
//	public List<String> sumOfDonationCashByTemple(@PathVariable("id") long id)
//	{
//		return temple_Service.ProfitOfDonationCashByTemple(id);
//	}
	
	@GetMapping("TempleInfo/{templeName}")
	public List<Temple> getbytempleName(@PathVariable("templeName") String templeName, Pageable pageable)
	{
		return temple_Service.getbytempleName(templeName, pageable);
	}
	
	
}
