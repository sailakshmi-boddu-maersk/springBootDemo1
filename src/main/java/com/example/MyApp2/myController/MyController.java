package com.example.MyApp2.myController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
//	
	@GetMapping("/customers/{id}")
//	@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
	public Optional<Customer> getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
//	@PostMapping("/customers")
	@RequestMapping(value = "/customers", method = RequestMethod.POST, 
    headers = "Accept=application/json")
	public void addTopic(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	@GetMapping("/customers/")
	public Optional<Customer> getCus(@RequestParam int id) {
		return customerService.getCustomer(id);
	} 
	@DeleteMapping("/delcustomer/{id}")
//	@RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
	public void delCustomer(@PathVariable int id) {
		customerService.delCustomer(id);
	}
	

}
