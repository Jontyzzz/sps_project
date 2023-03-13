package com.studypointsystem.studypoint.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "labadmins")
public class LabAdmin {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int labAdminId;
	
	@Column
	private String labAdminName;
	@Column
	private String labAdminEmailId;
	@Column
	private String labAdminMobileNo;
	
	@OneToOne(mappedBy = "labAdmin")
	@JsonIgnoreProperties("labAdmin")
	private Library library;
	
	@OneToMany(mappedBy = "labAdmin")
	@JsonIgnoreProperties("labAdmin")
	private List<Resource> resource = new ArrayList<>();
	
	@OneToMany(mappedBy = "labAdmin")
	@JsonIgnoreProperties("labAdmin")
	private List<Book> book = new ArrayList<>();
	
	@OneToMany(mappedBy = "labAdmin")
	@JsonIgnoreProperties("labAdmin")
	private List<Canteen> canteen = new ArrayList<>();
	
	public int getLabAdminId() {
		
		return labAdminId;
	}
	public void setLabAdminId(int labAdminId) {
		this.labAdminId = labAdminId;
	}
	public String getLabAdminName() {
		return labAdminName;
	}
	public void setLabAdminName(String labAdminName) {
		this.labAdminName = labAdminName;
	}
	public String getLabAdminEmailId() {
		return labAdminEmailId;
	}
	public void setLabAdminEmailId(String labAdminEmailId) {
		this.labAdminEmailId = labAdminEmailId;
	}
	public String getLabAdminMobileNo() {
		return labAdminMobileNo;
	}
	public void setLabAdminMobileNo(String labAdminMobileNo) {
		this.labAdminMobileNo = labAdminMobileNo;
	}
	
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public List<Resource> getResource() {
		return resource;
	}
	public void setResource(List<Resource> resource) {
		this.resource = resource;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public List<Canteen> getCanteen() {
		return canteen;
	}
	public void setCanteen(List<Canteen> canteen) {
		this.canteen = canteen;
	}
	public LabAdmin() {
	//	super();
	}
	
	public LabAdmin(int labAdminId, String labAdminName, String labAdminEmailId, String labAdminMobileNo,
			Library library, List<Resource> resource, List<Book> book, List<Canteen> canteen) {
		super();
		this.labAdminId = labAdminId;
		this.labAdminName = labAdminName;
		this.labAdminEmailId = labAdminEmailId;
		this.labAdminMobileNo = labAdminMobileNo;
		this.library = library;
		this.resource = resource;
		this.book = book;
		this.canteen = canteen;
	}
	
	@Override
	public String toString() {
		return "LabAdmin [labAdminId=" + labAdminId + ", labAdminName=" + labAdminName + ", labAdminEmailId="
				+ labAdminEmailId + ", labAdminMobileNo=" + labAdminMobileNo + ", library=" + library + ", resource="
				+ resource + ", book=" + book + ", canteen=" + canteen + "]";
	}
	
	
}
