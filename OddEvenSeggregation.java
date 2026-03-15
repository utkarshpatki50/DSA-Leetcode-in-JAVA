package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenSeggregation {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//  partitioningBy:   Splits elements into two groups based on condition.

		Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(result);

		System.out.println("Even numbers: " + result.get(true));
		System.out.println("Odd numbers: " + result.get(false));
	}
}