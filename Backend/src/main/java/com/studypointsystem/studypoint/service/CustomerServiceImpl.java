package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.Customer;
import com.studypointsystem.studypoint.entity.Library;
import com.studypointsystem.studypoint.repository.CustomerRepository;
import com.studypointsystem.studypoint.repository.LibraryRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> getAllCustomer() {
		
		return this.customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(int customerId) {
		Optional<Customer> entity = customerRepository.findById(customerId);
		Customer foundCustomer=entity.get();
		return foundCustomer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
	    customerRepository.save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		
		Optional<Customer> entity = customerRepository.findById(customerId);
		Customer foundCustomer=entity.get();
		customerRepository.delete(foundCustomer);
	}

}
