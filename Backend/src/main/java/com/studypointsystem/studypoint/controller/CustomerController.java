package com.studypointsystem.studypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypointsystem.studypoint.entity.Customer;
import com.studypointsystem.studypoint.entity.Library;
import com.studypointsystem.studypoint.service.CustomerService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerService;
	
	@GetMapping("/customers")
	@ResponseBody
	public List<Customer> getAllCustomers(){
		return this.customerService.getAllCustomer();
	}
	
	@PostMapping("/customer")
	public Customer addLibrary(@RequestBody Customer customer) {
		return this.customerService.addCustomer(customer);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.customerService.updateCustomer(customer);
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomer (@PathVariable int customerId) {
		
		return this.customerService.getCustomer(customerId);
	}
	
	@DeleteMapping("/customer/{customerId}")
	public ResponseEntity<HttpStatus>deleteLibrary(@PathVariable int customerId)
	{
		try {
			this.customerService.deleteCustomer(customerId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
