package com.example.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		// 1️⃣ Basic Supplier
		Supplier<String> message = () -> "Hello Utkarsh";

		System.out.println(message.get());


		// 2️⃣ Random Number Supplier
		Supplier<Double> randomNumber = () -> Math.random();

		System.out.println(randomNumber.get());
		System.out.println(randomNumber.get());
	}
}