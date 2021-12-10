package com.bareminds.TempleApp3.Repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bareminds.TempleApp3.models.Utencils;

@Repository
public interface UtensilsRepository extends JpaRepository<Utencils, Integer>{
	
	//@Query("insert into Utencils(type,quantity) values(?1,?2) where donation.temple.id=?3")
	//Utencils addNewUtencils(Utencils utensils, long id);
	
	@Query("Select utencil from Utencils utencil  where utencil.donation.temple.id=?1")
	List<Utencils> findUtencilsBytemple(long id);
	
	@Query("Select utencil.type,utencil.quantity From Utencils utencil where utencil.id=?1 ORDER BY utencil.id DESC")
	List<String> UtencilInfo(int id);

}
