package com.demo.model;

public class employeeprofile {
	private String employeeprofile;
	public employeeprofile() {
		super();
	}
	public employeeprofile(String employeeprofile) {
		super();
		this.employeeprofile = employeeprofile;
	}
	public String getEmployeeprofile() {
		return employeeprofile;
	}
	public void setEmployeeprofile(String employeeprofile) {
		this.employeeprofile = employeeprofile;
	}
	@Override
	public String toString() {
		return "employeeprofile [employeeprofile=" + employeeprofile + "]";
	}
	
}
