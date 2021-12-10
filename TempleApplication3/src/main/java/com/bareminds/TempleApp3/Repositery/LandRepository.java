package com.bareminds.TempleApp3.Repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bareminds.TempleApp3.models.Land;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
public interface LandRepository extends JpaRepository<Land, Integer>{
	
	@Query("Select land.Address,Area From Land land where land.landtype=?1 ORDER BY land.landId DESC")
	List<String> findDonationBylandtype(String landtype);

	//@Query("select")
	//@Query("Select land From Land where land.donation.temple.id=?1 ORDER BY land.landId ASC")
	
}
