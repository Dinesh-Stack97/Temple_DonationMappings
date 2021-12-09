package com.bareminds.TempleApp3.Service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.bareminds.TempleApp3.Repositery.DonarRepository;
import com.bareminds.TempleApp3.models.Donar;
import com.bareminds.TempleApp3.models.Donations;

public interface DonarService {

	List<Donar> getAllDonar(Integer pageNo, Integer size);
	//List<Donar> findDonarByDesigandtype(Boolean devotte, List<String> designationList);
	List<Donar> DonarByDesignation(String designation, Pageable pageable);
	
	}


