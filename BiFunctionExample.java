package com.example.functionalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		
//		Definition
//
//		Takes 2 inputs and returns 1 output

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		System.out.println(add.apply(10, 20));
	}
}