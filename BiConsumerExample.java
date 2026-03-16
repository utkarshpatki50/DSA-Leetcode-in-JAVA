package com.example.functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
//		Definition
//		Takes 2 inputs but returns nothing

		BiConsumer<String, Integer> print = (name, age) -> System.out.println(name + " " + age);

		print.accept("Utkarsh", 24);
	}
}