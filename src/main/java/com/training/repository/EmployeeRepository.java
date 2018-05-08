package com.training.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
