package com.bareminds.TempleApp3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="utencils")
public class Utencils {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Type")
	private String type;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn
	private Donations donation;

	public Utencils() {
		
		// TODO Auto-generated constructor stub
	}

	public Utencils(int id, String type, int quantity, Donations donation) {
		super();
		this.id = id;
		this.type = type;
		this.quantity = quantity;
		this.donation = donation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Donations getDonation() {
		return donation;
	}

	public void setDonation(Donations donation) {
		this.donation = donation;
	}
	
	

}
