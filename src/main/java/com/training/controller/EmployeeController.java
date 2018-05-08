package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Employee;
import com.training.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping("/add")
	public String addNewEmployee(@RequestParam String name, @RequestParam String salary) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		employeeRepository.save(employee);
		return "Saved";
	}
	
	@RequestMapping("/find")
	public Iterable<Employee> getAllUsers() {
		return employeeRepository.findAll();
	}
}
