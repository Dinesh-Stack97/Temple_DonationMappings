package com.bareminds.TempleApp3.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Donations")
public class Donations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="donaion_Id")
	private int donationId;
	
	
	
	@Column(name="LiveStocks")
    private String liveStocks;
	
	@Column(name="Groceries")
    private String groceries;
    
	@Column(name="Foundations")
    private String Foundations;
  
    
	@Column(name="Cash")
    private Double cash;
    
	@Column(name="OnlineDonations")
    private String OnlineDonations;
    
	@Column(name="Food_Heritage")
    private  String foodAndHeritage;
	
	@OneToMany(targetEntity = Land.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="donation_id", referencedColumnName = "donaion_Id")
	private List<Land> land;
	
	@ManyToMany(targetEntity = Donar.class,cascade = CascadeType.ALL)
	@JoinColumn(name="DonationId",referencedColumnName = "donaion_Id")
	private List<Donar> donar;

	public Donations() {
		
		// TODO Auto-generated constructor stub
	}

	public Donations(String liveStocks, String groceries, String foundations, Double cash,
			String onlineDonations, String foodAndHeritage, List<Land> land, List<Donar> donar) {
		super();
		
		this.liveStocks = liveStocks;
		this.groceries = groceries;
		this.Foundations = foundations;
		this.cash = cash;
		this.OnlineDonations = onlineDonations;
		this.foodAndHeritage = foodAndHeritage;
		this.land = land;
		this.donar = donar;
	}


	
	public String getLiveStocks() {
		return liveStocks;
	}

	public void setLiveStocks(String liveStocks) {
		this.liveStocks = liveStocks;
	}

	public String getGroceries() {
		return groceries;
	}

	public void setGroceries(String groceries) {
		this.groceries = groceries;
	}

	public String getFoundations() {
		return Foundations;
	}

	public void setFoundations(String foundations) {
		Foundations = foundations;
	}

	public Double getCash() {
		return cash;
	}

	public void setCash(Double cash) {
		this.cash = cash;
	}

	public String getOnlineDonations() {
		return OnlineDonations;
	}

	public void setOnlineDonations(String onlineDonations) {
		OnlineDonations = onlineDonations;
	}

	public String getFoodAndHeritage() {
		return foodAndHeritage;
	}

	public void setFoodAndHeritage(String foodAndHeritage) {
		this.foodAndHeritage = foodAndHeritage;
	}

	public List<Land> getLand() {
		return land;
	}

	public void setLand(List<Land> land) {
		this.land = land;
	}

	public List<Donar> getDonar() {
		return donar;
	}

	public void setDonar(List<Donar> donar) {
		this.donar = donar;
	}

	
	
	
}
