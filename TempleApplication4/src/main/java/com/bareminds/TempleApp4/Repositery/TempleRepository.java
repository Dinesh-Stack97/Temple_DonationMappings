package com.bareminds.TempleApp4.Repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bareminds.TempleApp4.models.Donar;
import com.bareminds.TempleApp4.models.Donations;
import com.bareminds.TempleApp4.models.Land;
import com.bareminds.TempleApp4.models.Temple;


public interface TempleRepository  extends JpaRepository<Temple, Long>{

	
	

}
