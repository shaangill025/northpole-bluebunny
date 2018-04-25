package com.northpole.service.impl;

import com.northpole.dao.CustomerDao;
import com.northpole.model.Customer;
import com.northpole.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Le on 1/23/2016.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer (Customer customer) {
        customerDao.addCustomer(customer);
    }

    public Customer getCustomerById (int customerId) {
        return customerDao.getCustomerById(customerId);
    }

    public Customer getCustomerByUsername (String username) {
        return customerDao.getCustomerByUsername(username);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

}
