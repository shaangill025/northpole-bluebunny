package com.northpole.service;

import com.northpole.model.Customer;

import java.util.List;

/**
 * Created by Le on 1/23/2016.
 */
public interface CustomerService {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    Customer getCustomerByUsername (String username);

    List<Customer> getAllCustomers();
}
