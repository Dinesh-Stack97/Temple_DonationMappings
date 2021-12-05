package com.bareminds.TempleApp3.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Donar")
public class Donar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DonarId")
	private int donarId;
	
	@Column(name ="DonarName")
	private String donarName;
	
	@Column(name="DonationType")
	private String donationType;
	
	@Column(name="Designation")
	private String designation;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="Locality")
	private String locality;
	
	@ManyToMany(targetEntity = Donations.class,cascade = CascadeType.ALL)
	@JoinColumn(name="DonarId",referencedColumnName = "DonarId")
	private List<Donations> donation;

	public Donar() {
		
		// TODO Auto-generated constructor stub
	}

	public Donar(String donarName, String donationType, String designation, String phoneNumber,
			String email, String locality, List<Donations> donation) {
		super();
		
		this.donarName = donarName;
		this.donationType = donationType;
		this.designation = designation;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.locality = locality;
		this.donation = donation;
	}

	

	

	public String getDonarName() {
		return donarName;
	}

	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}

	public String getDonationType() {
		return donationType;
	}

	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public List<Donations> getDonation() {
		return donation;
	}

	public void setDonation(List<Donations> donation) {
		this.donation = donation;
	}


	
}
