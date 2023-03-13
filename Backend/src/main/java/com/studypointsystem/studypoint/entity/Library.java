package com.studypointsystem.studypoint.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="libraries")
public class Library {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int libraryId;
	@Column
	private String libraryName;
	@Column
	private String libraryLocation;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="labAdmin")
	@JsonIgnoreProperties("library")
	private LabAdmin labAdmin;
	@Column
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate year_of_eastablishment;
	@Column
	private int price;
	
	@OneToMany(mappedBy = "library",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("library")
	private List<Facility> facility = new ArrayList<>();
	@Column
	private String libraryImgUrl;
	
	@OneToMany(mappedBy = "library",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("library")
	private List<LibrarySeat> librarySeat = new ArrayList<>();
	
	@OneToOne(mappedBy = "library")
	@JsonIgnoreProperties("library")
	private Customer customer;
	
	public Library() {
		super();
	}

	

	public Library(int libraryId, String libraryName, String libraryLocation, LabAdmin labAdmin,
			LocalDate year_of_eastablishment, int price, List<Facility> facility, String libraryImgUrl,
			List<LibrarySeat> librarySeat, Customer customer) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryLocation = libraryLocation;
		this.labAdmin = labAdmin;
		this.year_of_eastablishment = year_of_eastablishment;
		this.price = price;
		this.facility = facility;
		this.libraryImgUrl = libraryImgUrl;
		this.librarySeat = librarySeat;
		this.customer = customer;
	}



	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryLocation() {
		return libraryLocation;
	}

	public void setLibraryLocation(String libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	public LabAdmin getLabAdmin() {
		return labAdmin;
	}

	public void setLabAdmin(LabAdmin labAdmin) {
		this.labAdmin = labAdmin;
	}

	public LocalDate getYear_of_eastablishment() {
		return year_of_eastablishment;
	}

	public void setYear_of_eastablishment(LocalDate year_of_eastablishment) {
		this.year_of_eastablishment = year_of_eastablishment;
	}

	public int getPrice() {
		return price;
	}

	public List<LibrarySeat> getLibrarySeat() {
		return librarySeat;
	}

	public void setLibrarySeat(List<LibrarySeat> librarySeat) {
		this.librarySeat = librarySeat;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Facility> getFacility() {
		return facility;
	}

	public void setFacility(List<Facility> facility) {
		this.facility = facility;
	}

	public String getLibraryImgUrl() {
		return libraryImgUrl;
	}

	public void setLibraryImgUrl(String libraryImgUrl) {
		this.libraryImgUrl = libraryImgUrl;
	}
	


	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryLocation="
				+ libraryLocation + ", labAdmin=" + labAdmin + ", year_of_eastablishment=" + year_of_eastablishment
				+ ", price=" + price + ", facility=" + facility + ", libraryImgUrl=" + libraryImgUrl + ", librarySeat="
				+ librarySeat + ", customer=" + customer + "]";
	}

	
	
}
