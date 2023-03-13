package com.studypointsystem.studypoint.service;

import java.util.List;
import com.studypointsystem.studypoint.entity.Customer;

public interface CustomerService {

public List<Customer> getAllCustomer();
	
	public Customer getCustomer(int customerId);

	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(int customerId);
}
