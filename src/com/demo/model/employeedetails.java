package com.demo.model;

public class employeedetails {
private String employeedetails;
public employeedetails() {
	super();
}
public employeedetails(String employeedetails) {
	super();
	this.employeedetails = employeedetails;
}
public String getEmployeedetails() {
	return employeedetails;
}
public void setEmployeedetails(String employeedetails) {
	this.employeedetails = employeedetails;
}
@Override
public String toString() {
	return "employeedetails [employeedetails=" + employeedetails + "]";
}

}
