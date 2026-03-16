package com.example.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

//		Definition
//
//		Consumer takes input but returns nothing.

		// 1️⃣ Basic Consumer
		Consumer<String> printName = name -> System.out.println(name);

		printName.accept("Utkarsh");

		// 2️⃣ Consumer with List
		List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");

		names.forEach(printName);

		// 3️⃣ andThen() -> chaining consumers
		Consumer<String> printUpper = name -> System.out.println(name.toUpperCase());

		Consumer<String> combined = printName.andThen(printUpper);

		combined.accept("java");
	}

}
