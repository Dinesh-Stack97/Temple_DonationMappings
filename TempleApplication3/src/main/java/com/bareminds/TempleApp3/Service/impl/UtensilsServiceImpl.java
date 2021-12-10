package com.bareminds.TempleApp3.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp3.Exception.Spring_Boot_Apk_Exception;
import com.bareminds.TempleApp3.Repositery.TempleRepository;
import com.bareminds.TempleApp3.Repositery.UtensilsRepository;
import com.bareminds.TempleApp3.Service.UtensilsService;
import com.bareminds.TempleApp3.dto.AddUtencils;
import com.bareminds.TempleApp3.models.Temple;
import com.bareminds.TempleApp3.models.Utencils;

@Service
public class UtensilsServiceImpl implements UtensilsService{
	
	@Autowired
	private UtensilsRepository  utensilsRepository;
	
	@Autowired
	private TempleRepository templeRepository;

	@Override
	public Utencils AddUtensilswithTempleId(long id, AddUtencils addUtensils) {
		// TODO Auto-generated method st
		Temple temple = templeRepository.findById(id).orElseThrow(()->new Spring_Boot_Apk_Exception("temple", "id", id));
		
		return utensilsRepository.save(addUtensils.getUtensils());
	}

//	@Override
//	public Utencils addNewUtencils(Utencils utensils, long id) {
//		 TODO Auto-generated method stub
//		return utensilsRepository.addNewUtencils(utensils, id);
//	}

	@Override
	public List<Utencils> getUtencilsBytemple(long id) {
		// TODO Auto-generated method stub
		return utensilsRepository.findUtencilsBytemple(id);
	}
	
	



}
