package com.bareminds.TempleApp3.Repositery;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.Session;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bareminds.TempleApp3.models.Donar;
import com.bareminds.TempleApp3.models.Donations;
import com.bareminds.TempleApp3.models.Land;

public interface DonarRepository extends JpaRepository<Donar, Integer>{
//	
//	@Query("select d from Donar d where d.donationType:devotte and d.designation in :designationList")
//	List<Donar> findDonarByTypeandDesignation(@Param("devotte") Boolean devotte,
//			                                   @Param("designationList") List<String> designationList);
//	
// 
	@Query("From Donar where designation= ?1")
	List<Donar> DonarByDesignation(String designation, Pageable pageable);
//	 try(
//    		 
//    		 
//    		 Session session =    ( Hibernate_session_factry.geSessionFactory()).openSession()){
//    	 
//    	
//    
//     
//    	session.beginTransaction();
//    
//	String hql = "From Donar where donationType=?1";
//	Query querry = (Query) session.createQuery(hql);
//	querry.setMaxResaults(1);
	
	
	
}

