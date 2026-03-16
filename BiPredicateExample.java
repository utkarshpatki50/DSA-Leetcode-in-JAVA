package com.example.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	
	
//	Definition
//	Returns boolean for two inputs

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> check = (a, b) -> a > b;

		System.out.println(check.test(10, 5));
	}
}
