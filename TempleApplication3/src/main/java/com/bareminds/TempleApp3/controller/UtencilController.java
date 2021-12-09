package com.bareminds.TempleApp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bareminds.TempleApp3.Service.UtensilsService;
import com.bareminds.TempleApp3.models.Utencils;

@RestController
public class UtencilController {

	@Autowired
	private UtensilsService utensilsService;
	
	@GetMapping("Temple/add/utencil/{utencil}")
	public Utencils addNewUtencils(@RequestBody Utencils utensils,@PathVariable("utencil") long id)
	{
		return utensilsService.addNewUtencils(utensils, id);
	}
	
	@GetMapping("temple/viewUtencils/{id}")
	public List<Utencils> getUtencilsBytemple(@PathVariable("id")long id)
	{
		return utensilsService.getUtencilsBytemple(id);
	}
}
