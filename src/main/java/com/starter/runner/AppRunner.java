package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.document.Address;
import com.starter.document.Employee;
import com.starter.repo.EmpolyeeRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private EmpolyeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		repo.deleteAll();
		
		repo.save(new Employee(101, "DEF", new Address("1-3A", "VJW")));
	}

}
