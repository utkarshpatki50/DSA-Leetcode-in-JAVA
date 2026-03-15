package com.example.lambda;

import java.util.Arrays;
import java.util.List;

public class SumAndAverageOfNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 10, 15, 25);

		int ans = list.stream().reduce(0, Integer::sum);

		System.out.println("Sum := " + ans);
		
		double average= list.stream()
				.mapToInt(Integer:: intValue)                //average() works on primitive streams
				.average()
				.orElse(0);
		
		System.out.println("Average := " + average);

	}

}
