package com.example.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

//		Definition
//
//		Function<T,R> takes an input and returns an output.
		
		// 1️⃣ apply() - basic usage
		Function<Integer, Integer> square = n -> n * n;

		System.out.println("Square of 5: " + square.apply(5));

		// 2️⃣ andThen() -> first square then add 10
		Function<Integer, Integer> addTen = n -> n + 10;

		Function<Integer, Integer> squareThenAdd = square.andThen(addTen);

		System.out.println("Square then add 10: " + squareThenAdd.apply(5));

		// 3️⃣ compose() -> first add 10 then square
		Function<Integer, Integer> addThenSquare = square.compose(addTen);

		System.out.println("Add 10 then square: " + addThenSquare.apply(5));

		// 4️⃣ identity() -> returns same value
		Function<Integer, Integer> identityFunction = Function.identity();

		System.out.println("Identity result: " + identityFunction.apply(20));
	}

}
