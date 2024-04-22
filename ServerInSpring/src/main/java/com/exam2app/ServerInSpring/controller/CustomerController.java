package com.exam2app.ServerInSpring.controller;

import com.exam2app.ServerInSpring.model.customer.Customer;
import com.exam2app.ServerInSpring.model.customer.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @PostMapping()
    public void save(@RequestBody Customer customer) {
        customerDao.save(customer);

    }

    @GetMapping("/customer/get-all")
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();

    }


    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerDao.getCustomerById(id);
    }

    @GetMapping("/customer/{id}")
    public void deleteCustomerById(@PathVariable int id) {
        customerDao.deleteCustomerById(id);
    }


}
