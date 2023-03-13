package com.studypointsystem.studypoint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "facilities")
public class Facility {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int facilityId;
	
	@Column
	private String facilityName;
	
	@ManyToOne
	@JoinColumn(name="library")
	@JsonIgnoreProperties("library")
	private Library library;

	public Facility() {
		super();
	}

	public Facility(int facilityId, String facilityName, Library library) {
		super();
		this.facilityId = facilityId;
		this.facilityName = facilityName;
		this.library = library;
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Facility [facilityId=" + facilityId + ", facilityName=" + facilityName + ", library=" + library + "]";
	}
	
	
}
