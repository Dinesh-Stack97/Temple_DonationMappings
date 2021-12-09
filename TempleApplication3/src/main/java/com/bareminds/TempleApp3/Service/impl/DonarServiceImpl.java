package com.bareminds.TempleApp3.Service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.bareminds.TempleApp3.Repositery.DonarRepository;
import com.bareminds.TempleApp3.Service.DonarService;
import com.bareminds.TempleApp3.models.Donar;
import com.bareminds.TempleApp3.models.Donations;

@Service
public class DonarServiceImpl implements DonarService {
	
	@Autowired
	private DonarRepository donarRepository;


	@Override
	public List<Donar> getAllDonar(Integer pageNo, Integer size) {
		// TODO Auto-generated method stub
		Pageable pageable =  PageRequest.of(pageNo, size,Sort.by("designation"));
	    Page<Donar> page	= donarRepository.findAll(pageable);
	    return page.stream().collect(Collectors.toList());
	}


	@Override
	public List<Donar> DonarByDesignation(String designation, Pageable pageable) {
		// TODO Auto-generated method stub
		
		return donarRepository.DonarByDesignation(designation, PageRequest.of(0, 2, Direction.DESC, designation));
		
	}
}
//	
//	private DonarRepository donarRepository;;
//
//	public List<Donar> findDonarByDesigandtype(Boolean devotte, List<String> designationList) {
//		// TODO Auto-generated method stub
//		return donarRepository.findDonarByTypeandDesignation(devotte, designationList);
//	}
//}
