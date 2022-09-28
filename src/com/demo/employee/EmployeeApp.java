package com.demo.employee;


import java.util.List;
import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.serviceimp.EmployeeServiceImplement;


public class EmployeeApp {
	public static void main(String args[]) {
		int cases;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter case 1:");
		System.out.println("Enter case 2:");
		EmployeeService employeeservice =new EmployeeServiceImplement();
		boolean status=true;
		do {
			cases=sc.nextInt();
			switch(cases) {
			case 1:
				 Employee employee=new  Employee();
				 employee.setEmpid(10);
				 employee.setEmpname("Archana");
				 employee.setEmpemailaddress("AKANDI1@FORD.COM");
				 employee.setSalary(10000);
				 String insertEmployee=employeeservice.insertEmployee(employee);
				 System.out.println(insertEmployee);
			        break;
				case 2:
					List<Employee> allemployees=employeeservice.getAllEmployees();
					System.out.println(allemployees);
					break;
				}
			}while(status);
			sc.close();
		}

	
	

	
}
