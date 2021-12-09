package com.bareminds.TempleApp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bareminds.TempleApp3.Service.DonarService;
import com.bareminds.TempleApp3.models.Donar;
import com.bareminds.TempleApp3.models.Donations;

@RestController
public class DonarController {
	
	@Autowired
	private DonarService donarservice;
	
	
	
//	@GetMapping("Donar/{Devotte}/{designationList}")
//	public List<Donar> findDonarByDesigandtype(@PathVariable Boolean devotte,
//			                                     @PathVariable List<String> designationList)
//	{
//		return donarservice.findDonarByDesigandtype(devotte, designationList);
//	}



@GetMapping("/Donar")
public List<Donar> getAllDonar(@RequestParam(name="pageNo") Integer pageNo,@RequestParam(name="size") Integer size)
{
      return donarservice.getAllDonar(pageNo,size);
    		  
}

@GetMapping("donar/Designation/{designation}")
public List<Donar>  getDonarByDesignation(@PathVariable("designation") String designation, Pageable pageable){
	return donarservice.DonarByDesignation(designation, pageable);
}
}