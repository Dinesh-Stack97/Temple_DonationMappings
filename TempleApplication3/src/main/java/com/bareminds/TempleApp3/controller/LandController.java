package com.bareminds.TempleApp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bareminds.TempleApp3.Service.landservice;
import com.bareminds.TempleApp3.models.Land;

@RestController
@RequestMapping("land")
public class LandController {
	
	@Autowired
	private landservice Landservice;
	
	@GetMapping("temple/land/{type}")
	public  List<String> DonationBylandtype(@PathVariable("type") String landtype) {
		
		return Landservice.DonationBylandtype(landtype);
	}
	

}
