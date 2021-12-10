package com.bareminds.TempleApp3.Repositery;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bareminds.TempleApp3.dto.DonationReaquest;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;
import com.bareminds.TempleApp3.models.Utencils;


public interface TempleRepository  extends JpaRepository<Temple, Long>{

	@Query("select temple.donations FROM Temple temple where temple.id=?1")
	//@Query("select new com.bareminds.TempleApp3.dto.DonationReaquest(d)  from  Temple t where t JOIN t.donations d where t.id=?1")
	List<DonationReaquest> findDonationsBytemple(Long id);
	
	@Query("select t From Temple t where t.id=?1")
	Temple findTempleByID(long id);
	
	@Query("select temple From Temple temple where temple.no_of_Halls>?1")
	 List<Temple> findTempleByno_Of_Halls(int  no_of_Halls);
	@Query("select temple.templeName, temple.phoneNumber,temple.no_of_Halls From Temple temple  where temple.no_of_Halls>?1")
    List<String> findTempleInfobyNo_Of_Halls(int  no_of_Halls);
 
	@Query("select COUNT(donation.cash) From Donations donation where donation.temple.id=?1")
	 long  findCntAvgofdoantionsbyId(long id);
	
//	@Query("select temple.templeName, SUM(donation.cash) FROM Temple temple temple LEFT JOIN FETCH temple.donations donation where temple.id=?1 group by temple")
//	List<String> SumOfDonationCashByTemple(long id);

	@Query("From Temple where templeName=?1")
	List<Temple> findbytempleName(String templeName,Pageable pageable);

	
	//@Query("select p from Temple t where t JOIN t.donation d")
	
	
	

}
