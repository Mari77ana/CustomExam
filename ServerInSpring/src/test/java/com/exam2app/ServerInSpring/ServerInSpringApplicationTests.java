package com.exam2app.ServerInSpring;

import com.exam2app.ServerInSpring.model.customer.Customer;
import com.exam2app.ServerInSpring.model.customer.CustomerDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static java.sql.DriverManager.println;

@SpringBootTest
class ServerInSpringApplicationTests {

	@Autowired
	private CustomerDao customerDao;

	//@Test // it works to insert
	void contextLoads() {
		Customer customer = new Customer();
		customer.setEmail("BruceLee@email.com");
		customer.setPassword("karate");
		customer.setComment("Hello I am Bruce");
		customer.setChecked(true);
		customer.setFavorite(true);
		customer.setDate(LocalDate.of(1970,5,13));
		customer.setTime(LocalTime.of(10,30));
		customerDao.save(customer);

	}

	//@Test // It works to delete
	void getAllAndDeleteCustomers(){
		List<Customer> customers = customerDao.getAllCustomer();
		for (Customer customer: customers){
			customerDao.delete(customer);
		}

	}

	@Test // it works to get all
	void getAllCustomers(){
		List<Customer> customers = customerDao.getAllCustomer();
		System.out.println(customers);
	}

}
