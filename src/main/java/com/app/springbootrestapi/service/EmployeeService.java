package com.app.springbootrestapi.service;

import java.util.List;

import com.app.springbootrestapi.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployeeList();
	
	Employee getEmployee(Long employeeId);
	
	void deleteEmployee(Long employeeId);
	
}
