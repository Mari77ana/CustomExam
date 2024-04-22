package com.exam2app.ServerInSpring.model.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerDao {
    @Autowired // Dependency injection
    private CustomerRepository repository;

    public void save(Customer customer) {
        repository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(customers::add);
        return customers;
    }

    public void delete(Customer customer) {
        repository.delete(customer);
    }

    public void deleteCustomerById(int customerId){
        repository.deleteById(customerId);
    }

    public Customer getCustomerById(int customerId){
        return repository.findById(customerId).orElse(null);
    }


}
