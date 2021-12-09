package com.bareminds.TempleApp3.Repositery;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bareminds.TempleApp3.models.Donar;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Land;
import com.bareminds.TempleApp3.models.Temple;

public interface DonationsRepository extends JpaRepository<Donations,Integer> {
//
//	public void addDonationsbyId(String liveStock, String  groceries,
//			String Foundations,Double cash,String OnlineDonations, String foodAndHeritage, 
//			List<Land> land,List<Donar> donar);
	
	
	
	//@Query("select donation from Donations donation where donation.temple.id= ?1")
    //List<Donations> findDonationsByTempleId(Long id);
	
//@Query("select temple.donations FROM Temple temple where temple.id=?1")
@Query("select temple.donations From Temple temple where temple.id<=?1")

	
	List<Donations> findDonationsByTempleId(Long id);


	@Query("select donation.donationId, donation.liveStocks,donation.cash,donation.OnlineDonations From Donations donation where donation.temple.id=?1")
	List<String> findDonationInfobyTempleId(long id);
	
	@Query("SELECT donation.land From Donations donation where donation.temple.id=?1")
	List<Land> LandDonationsByTemple(long id);
	
	@Query("From Donations where groceries= ?1")
	List<Donations> DonationBygroceriesName(String groceries, Pageable pageable);
	
	Slice<Donations>  findAllBycash(double cash, Pageable pageable);
	
	Page<Donations> findAllByDonationId(int donationId, Pageable pageable);
	
	
	

}
