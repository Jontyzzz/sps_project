package com.studypointsystem.studypoint.entity;

import javax.persistence.CascadeType;
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
@Table(name = "canteens")
public class Canteen {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	
	@Column
	private String itemName;
	
	@Column
	private int itemPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "labAdmin")
	@JsonIgnoreProperties("labAdmin")
	private LabAdmin labAdmin;

	public Canteen() {
		super();
	}

	public Canteen(int itemId, String itemName, int itemPrice, LabAdmin labAdmin) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.labAdmin = labAdmin;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public LabAdmin getLabAdmin() {
		return labAdmin;
	}

	public void setLabAdmin(LabAdmin labAdmin) {
		this.labAdmin = labAdmin;
	}

	@Override
	public String toString() {
		return "Canteen [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", labAdmin="
				+ labAdmin + "]";
	}
}
