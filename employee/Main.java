package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Delhi", 10000);
		Employee employee2 = new Employee("Delhi", 5000);
		Employee employee3 = new Employee("Delhi", 1000);
		Employee employee4 = new Employee("Delhi", 10);
		Employee employee5 = new Employee("Delhi", 1000000);
		List<Employee> employees = new ArrayList<>();
		employees.add(employee5);
		employees.add(employee4);
		employees.add(employee3);
		employees.add(employee2);
		employees.add(employee1);
		Collections.sort(employees, new EmployeeComp());
		for(Employee employee : employees)
		{
			System.out.println(employee.getCity()+ " " + employee.getSalary());
		}
	}
}

class EmployeeComp implements Comparator<Employee>
{

	@Override
	public int compare(Employee employee1, Employee employee2) {
		int ret = employee1.getCity().compareTo(employee2.getCity());
		if(ret!=0)
			return ret;
		return employee1.getSalary()-employee2.getSalary();
	}

	
}