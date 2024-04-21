package com.exam2app.ServerInSpring;

import com.exam2app.ServerInSpring.model.customer.Customer;
import com.exam2app.ServerInSpring.model.customer.CustomerDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootTest
class ServerInSpringApplicationTests {

	@Autowired
	private CustomerDao customerDao;
	@Test
	void contextLoads() {
		Customer customer = new Customer();
		customer.setEmail("my@email.com");
		customer.setPassword("1234");
		customer.setComment("Hello");
		customer.setChecked(true);
		customer.setFavorite(true);
		customer.setDate(LocalDate.of(1960,4,23));
		customer.setTime(LocalTime.of(6,30));
		customerDao.save(customer);


	}

}
