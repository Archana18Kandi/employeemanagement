package com.demo.model;
import java.util.*;
public class Employee {
private int empid;
private String empname;
private String empemailaddress;
private int salary;
public Employee() {
	super();
}
public Employee(int empid, String empname, String empemailaddress, int salary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empemailaddress = empemailaddress;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpemailaddress() {
	return empemailaddress;
}
public void setEmpemailaddress(String empemailaddress) {
	this.empemailaddress = empemailaddress;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "employee [empid=" + empid + ", empname=" + empname + ", empemailaddress=" + empemailaddress + ", salary="
			+ salary + "]";
}

}
