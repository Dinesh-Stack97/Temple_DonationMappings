package com.bareminds.TempleApp3.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;


public interface TempleRepository  extends JpaRepository<Temple, Long>{

	
  
	

}
