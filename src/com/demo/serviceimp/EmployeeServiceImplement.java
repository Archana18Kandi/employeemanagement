package com.demo.serviceimp;

import java.util.*;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class EmployeeServiceImplement implements EmployeeService {
	List<Employee>employees=new ArrayList<Employee>();

	@Override
	public String insertEmployee(Employee employee) {
		this.employees.add(employee);
		return "Employee details inserted!!!";
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}
	
 
}
