package com.starter.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.starter.document.Employee;

public interface EmpolyeeRepository extends MongoRepository<Employee, String> {

}
