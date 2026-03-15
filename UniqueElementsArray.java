package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElementsArray {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,3);
		List<Integer> unique= list.stream()
				.distinct().collect(Collectors.toList());
		
		System.out.println("Unique Elements := " + unique);
	}
}
