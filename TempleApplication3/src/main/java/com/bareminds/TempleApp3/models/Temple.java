package com.bareminds.TempleApp3.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bareminds.TempleApp3.dto.AddDonations;

@Entity
@Table(name = "templeDB")
public class Temple {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "temple_name")
	private String templeName;

	@Column(name = "priest_name")
	private String priestName;

	@Column(name = "phone_number")
	private long phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "n0_Of_Halls")
	private int no_of_Halls;

	@Column(name = "revenue")
	private double revenue;

	@Column(name = "expences")
	private double expences;
	
	@OneToMany(targetEntity = Donations.class ,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name="td_fk",referencedColumnName = "id")
	private List<Donations> donations;

	public Temple() {

	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getTempleName() {
		return templeName;
	}



	public void setTempleName(String templeName) {
		this.templeName = templeName;
	}



	public String getPriestName() {
		return priestName;
	}



	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}



	public long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getNo_of_Halls() {
		return no_of_Halls;
	}



	public void setNo_of_Halls(int no_of_Halls) {
		this.no_of_Halls = no_of_Halls;
	}



	public double getRevenue() {
		return revenue;
	}



	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}



	public double getExpences() {
		return expences;
	}



	public void setExpences(double expences) {
		this.expences = expences;
	}



	public List<Donations> getDonations() {
		return donations;
	}



	public void setDonations(List<Donations> donations) {
		this.donations = donations;
	}



	public Temple(long id, String templeName, String priestName, long phoneNumber, String email, int no_of_Halls,
			double revenue, double expences, List<Donations> donations) {
		super();
		this.id = id;
		this.templeName = templeName;
		this.priestName = priestName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.no_of_Halls = no_of_Halls;
		this.revenue = revenue;
		this.expences = expences;
		this.donations = donations;
	}
	



	public void addDonation(Donations donation)
	{
		
		donations.add(donation);
		donation.setTemple(this);
	}
	
	public void deleteDonation(Donations donation)
	{
		donations.remove(donation);
		donation.setTemple(null);
	}






	

}
