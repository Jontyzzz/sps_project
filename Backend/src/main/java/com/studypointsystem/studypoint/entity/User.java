package com.studypointsystem.studypoint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@NotEmpty(message = "Please enter your user id")
	@Size(min = 5, max = 15 )
	@Pattern(regexp = "^[a-zA-Z0-9.\\\\-\\\\@_ ]*$",  message = " special characters allowed are: @ _ ")
	private String userId;
	@Column
	
	@NotEmpty(message = "Please enter your first name")
	private String firstName;
   
	@Column
	@NotEmpty
	@Size(min = 3, message = "lastname must be min of 3 charcters")
	private String lastName;
	@Column
	
	@NotEmpty
	@Size(min = 3, max = 20, message = "password must contain min 3 characters and max 10 charcters")
	private String password;
	
	@OneToOne(mappedBy = "user")
	@JsonIgnoreProperties("user")
	private Customer customer;
	
	public User() {

	}

	public User(
			@NotEmpty(message = "Please enter your user id") @Size(min = 5, max = 15) @Pattern(regexp = "^[a-zA-Z0-9.\\\\-\\\\@_ ]*$", message = " special characters allowed are: @ _ ") String userId,
			@NotEmpty(message = "Please enter your first name") String firstName,
			@NotEmpty @Size(min = 3, message = "lastname must be min of 3 charcters") String lastName,
			@NotEmpty @Size(min = 3, max = 10, message = "password must contain min 3 characters and max 10 charcters") String password,
			Customer customer) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.customer = customer;
	}

	


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", customer=" + customer + "]";
	}

	
	
}

