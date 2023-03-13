package com.studypointsystem.studypoint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	private String bookId;
	@Column
	private String bookName;
	@Column
	private String bookAuthor;
	@Column
	private int bookPrice;
	@Column
	private int bookQuantity;
	@Column
	private String bookPublisher;
	
    @ManyToOne
    @JoinColumn(name="labAdmin")
    @JsonIgnoreProperties("labAdmin")
	private LabAdmin labAdmin;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public LabAdmin getLabAdmin() {
		return labAdmin;
	}

	public void setLabAdmin(LabAdmin labAdmin) {
		this.labAdmin = labAdmin;
	}

	public Book(String bookId, String bookName, String bookAuthor, int bookPrice, int bookQuantity, String bookPublisher,
			LabAdmin labAdmin) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookQuantity = bookQuantity;
		this.bookPublisher = bookPublisher;
		this.labAdmin = labAdmin;
	}
	
	public Book() {
		
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookQuantity=" + bookQuantity + ", bookPublisher=" + bookPublisher + ", labAdmin="
				+ labAdmin + "]";
	}
}
