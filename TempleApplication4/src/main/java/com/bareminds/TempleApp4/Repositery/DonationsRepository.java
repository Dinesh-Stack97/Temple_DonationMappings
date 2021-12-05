package com.bareminds.TempleApp4.Repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bareminds.TempleApp4.models.Donar;
import com.bareminds.TempleApp4.models.Donations;
import com.bareminds.TempleApp4.models.Land;

public interface DonationsRepository extends JpaRepository<Donations,Integer> {

//	public void addDonationsbyId(String liveStock, String  groceries,
//			String Foundations,Double cash,String OnlineDonations, String foodAndHeritage, 
//			List<Land> land,List<Donar> donar);
//	

//	public void addDonationsbyId(Donations liveStock, Donations  groceries,
//			Donations Foundations,Donations cash,Donations OnlineDonations, Donations foodAndHeritage, 
//			 Donations Land,Donations donar);
}
