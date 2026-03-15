package com.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  id + " " + name ;
	}

	@Override
	public int compareTo(Student s) {

		return this.id - s.id;
	}

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(10, "Utkarsh"));
		list.add(new Student(19, "Athu"));
		list.add(new Student(1, "Sanjay"));
		list.add(new Student(17, "Aditya"));

		//Collections.sort(list);  // Using Comparable
		
		Collections.sort(list, new NameComparator());

		System.out.println(list);
	}

}
