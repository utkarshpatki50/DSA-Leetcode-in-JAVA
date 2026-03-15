package com.example.lambda;

import java.util.Map;
import java.util.stream.Collectors;

public class EachCharOccurance {

	public static void main(String[] args) {

		String str = "utkarshpatki";

		Map<Character, Long> mp = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println("Appearance of each char: = " + mp);

	}

}
