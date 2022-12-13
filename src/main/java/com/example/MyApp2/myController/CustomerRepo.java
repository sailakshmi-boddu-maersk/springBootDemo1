package com.example.MyApp2.myController;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyApp2.myController.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

	

//	Customer findOne(int id);
	
	

}
