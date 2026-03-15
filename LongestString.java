package com.example.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("wertyuio", "asdfghjklkjhgfdxs", "dfg");

		String longest = list.stream().max(Comparator.comparing(String::length)).orElse(null);

		System.out.println("Longest String := " + longest);
		
		String shortest = list.stream().min(Comparator.comparing(String::length)).orElse(null);
		
		System.out.println("Shortest String := " + shortest);
		
	}

}
