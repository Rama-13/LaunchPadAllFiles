package com.deloitte.cms.dao;
import com.deloitte.cms.model.Customer;

import java.util.List;

public interface CustomerDAO {
public List<Customer> getAllCustomers();
public boolean insertCustomer(Customer customer);
public boolean updateCustomer(Customer customer);
public boolean deleteCustomer(int customerId);
public Customer searchCustomerById(int customerId);
public boolean isCustomerExists(int customerId);
}
