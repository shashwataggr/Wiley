package com.employee;

public class Employee {
	private String City;
	private int salary;
	
	public Employee(String city, int salary) {
		super();
		City = city;
		this.salary = salary;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
