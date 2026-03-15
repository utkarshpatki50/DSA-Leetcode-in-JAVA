package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {

	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Amit", 50000));
		list.add(new Employee(2, "Rahul", 70000));
		list.add(new Employee(3, "Ankit", 50000));
		list.add(new Employee(4, "Utkarsh", 70000));
		list.add(new Employee(5, "Neha", 60000));

		list.sort((e1, e2) -> e2.salary - e1.salary); // salary descending

		System.out.println("salary descending" + list);

		list.sort((e1, e2) -> e1.salary - e2.salary); // salary ascending

		System.out.println("salary ascending" + list);

		// Sort by Salary, if salary same, sort by name
		list.sort(Comparator.comparing((Employee e) -> e.salary).thenComparing(e -> e.name));

		System.out.println("Sort by Salary, if salary same, sort by name" + list);

		list.sort(Comparator.comparing((Employee e) -> e.salary).reversed().thenComparing(e -> e.name));

		System.out.println("Sort by Salary Desc, if salary same, sort by name" + list);

	}

}