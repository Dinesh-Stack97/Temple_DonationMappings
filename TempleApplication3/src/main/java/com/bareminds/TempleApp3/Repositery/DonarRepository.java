package com.bareminds.TempleApp3.Repositery;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bareminds.TempleApp3.models.Donar;
import com.bareminds.TempleApp3.models.Land;

public interface DonarRepository extends JpaRepository<Donar, Integer>{
 
	
}

