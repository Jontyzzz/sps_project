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
@Table(name = "resources")
public class Resource {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int resourceId;
	
	@Column
	private String resourceType;
	
	@Column
	private String resourceName;
	
	@Column
	private int resourcePrice;
	
	@Column
	private int quantity;
	
	@ManyToOne 
	@JoinColumn(name= "labAdmin")
	@JsonIgnoreProperties("labAdmin")
	private LabAdmin labAdmin;
	
	public Resource() {
		
	}
          public Resource(int resourceId, String resourceType, String resourceName, int resourcePrice, int quantity,
			LabAdmin labAdmin) {
		super();
		this.resourceId = resourceId;
		this.resourceType = resourceType;
		this.resourceName = resourceName;
		this.resourcePrice = resourcePrice;
		this.quantity = quantity;
		this.labAdmin = labAdmin;
	}
		public int getResourceId() {
			return resourceId;
		}
		public void setResourceId(int resourceId) {
			this.resourceId = resourceId;
		}
		public String getResourceType() {
			return resourceType;
		}
		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
		public String getResourceName() {
			return resourceName;
		}
		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
		public int getResourcePrice() {
			return resourcePrice;
		}
		public void setResourcePrice(int resourcePrice) {
			this.resourcePrice = resourcePrice;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public LabAdmin getLabAdmin() {
			return labAdmin;
		}
		public void setLabAdmin(LabAdmin labAdmin) {
			this.labAdmin = labAdmin;
		}
		@Override
		public String toString() {
			return "Resource [resourceId=" + resourceId + ", resourceType=" + resourceType + ", resourceName="
					+ resourceName + ", resourcePrice=" + resourcePrice + ", quantity=" + quantity + ", labAdmin="
					+ labAdmin + "]";
		}
          
}

