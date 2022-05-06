package com.net.practice.service;

import java.util.List;

import com.net.practice.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployee(long id);

}
