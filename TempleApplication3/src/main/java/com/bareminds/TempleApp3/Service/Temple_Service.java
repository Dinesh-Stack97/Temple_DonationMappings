package com.bareminds.TempleApp3.Service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.bareminds.TempleApp3.dto.DonationReaquest;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Temple;


public interface Temple_Service {
	
	Temple SveTemple(DonationReaquest request);
	List<Temple> getAllTempleDetails();
	Temple getTempleById(long id);
	Temple updateTempleById(Temple temple, long id);
	void deleteTempleById(long id);
	List<DonationReaquest> getDonationByTemple(long id);
    Temple getTempByid(long id);
    List<Temple> getTemplewithHall(int  no_of_Halls);
    List<String> getTempleInfobyNo_Of_Halls(int  no_of_Halls);
    List<String> getDonationInfobyTempleId(long id);
    
    long getCntAvgofdoantionsbyId(long id);
    
//    List<String> ProfitOfDonationCashByTemple(long id);
    List<Temple> getbytempleName(String templeName,Pageable pageable);
}
