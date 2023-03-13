package com.studypointsystem.studypoint.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	private String email;
	
	private String mobileNo;
	
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user")
	@JsonIgnoreProperties("customer")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="library")
	@JsonIgnoreProperties("customer")
	private Library library;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate startDate;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate endDate;
	
	public Customer() {
		super();
	}

	


	public Customer(int customerId, String email, String mobileNo, String address, User user, Library library,
			LocalDate startDate, LocalDate endDate) {
		super();
		this.customerId = customerId;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.user = user;
		this.library = library;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	

	public LocalDate getEndDate() {
		return endDate;
	}




	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}




	public LocalDate getStartDate() {
		return startDate;
	}



	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", mobileNo=" + mobileNo + ", Address="
				+ address + ", user=" + user + ", library=" + library + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
}
