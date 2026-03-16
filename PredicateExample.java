package com.example.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 18, 45, 7, 80);

		Predicate<Integer> even = n -> n % 2 == 0;
		Predicate<Integer> greaterThan10 = n -> n > 10;

		// AND condition
		Predicate<Integer> condition = even.and(greaterThan10);

		System.out.println("Even Numbers:");
		numbers.stream().filter(even).forEach(System.out::println);

		System.out.println("\nEven AND Greater than 10:");
		numbers.stream().filter(condition).forEach(System.out::println);

		System.out.println("\nEven OR Greater than 10:");
		numbers.stream().filter(even.or(greaterThan10)).forEach(System.out::println);

		System.out.println("\nNOT Even:");
		numbers.stream().filter(even.negate()).forEach(System.out::println);
	}

}
