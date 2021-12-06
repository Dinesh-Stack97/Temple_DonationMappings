package com.bareminds.TempleApp3.Repositery;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bareminds.TempleApp3.models.Donar;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Land;

public interface DonationsRepository extends JpaRepository<Donations,Integer> {
//
//	public void addDonationsbyId(String liveStock, String  groceries,
//			String Foundations,Double cash,String OnlineDonations, String foodAndHeritage, 
//			List<Land> land,List<Donar> donar);
	
	
	
	@Query("select donation from Donations donation where donation.temple.id= ?1")
	//@Query("select t from Donations t  where t.id = ?1")
	List<Donations> findDonationsByTempleId(Long id);
}
