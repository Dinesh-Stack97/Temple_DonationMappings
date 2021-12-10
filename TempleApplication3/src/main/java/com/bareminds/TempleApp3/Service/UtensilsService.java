package com.bareminds.TempleApp3.Service;

import java.util.List;

import com.bareminds.TempleApp3.dto.AddUtencils;
import com.bareminds.TempleApp3.models.Utencils;

public interface UtensilsService {
	
	Utencils AddUtensilswithTempleId(long id,AddUtencils addUtensils);
	//Utencils addNewUtencils(Utencils utensils, long id);
	List<Utencils> getUtencilsBytemple(long id);

}
