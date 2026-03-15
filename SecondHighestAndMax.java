package com.example.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestAndMax {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(10,99,50,45,18);
		
		Integer ans= list.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		
		System.out.println("Second Highest Number := " + ans);
		
		Integer max = list.stream().max(Integer::compare)
				.orElse(null);
		
		System.out.println("Maximum Number := " + max);
		
		
		Integer min = list.stream().min(Integer::compare)
				.orElse(null);
		
		System.out.println("Minimum Number := " + min);

	}

}
