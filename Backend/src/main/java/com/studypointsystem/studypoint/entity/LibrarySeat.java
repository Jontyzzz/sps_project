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
@Table(name = "libraryseats")
public class LibrarySeat {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int seatId;
	
	@Column
	private int seatAllocation;
	
	@ManyToOne
	@JoinColumn(name = "library")
	@JsonIgnoreProperties("library")
	private Library library;
	
	public LibrarySeat() {
		super();
	}

	public LibrarySeat(int seatId, int seatAllocation, Library library) {
		super();
		this.seatId = seatId;
		this.seatAllocation = seatAllocation;
		this.library = library;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getSeatAllocation() {
		return seatAllocation;
	}

	public void setSeatAllocation(int seatAllocation) {
		this.seatAllocation = seatAllocation;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "LibrarySeat [seatId=" + seatId + ", seatAllocation=" + seatAllocation + ", library=" + library + "]";
	}
}
