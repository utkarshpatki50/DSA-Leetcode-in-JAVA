package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employeee {

	int id;
	String name;
	String department;

	Employeee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + department;
	}
}

public class EmployeeGroupByDepartment {

	public static void main(String[] args) {

		List<Employeee> employees = Arrays.asList(new Employeee(1, "Amit", "IT"), new Employeee(2, "Rahul", "HR"),
				new Employeee(3, "Sneha", "IT"), new Employeee(4, "Neha", "Finance"));

		Map<String, List<Employeee>> result = employees.stream().collect(Collectors.groupingBy(Employeee::getDepartment));

		System.out.println(result);
	}

}