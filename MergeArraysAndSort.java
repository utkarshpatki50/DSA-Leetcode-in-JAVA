package com.example.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeArraysAndSort {
	
	public static void main(String [] args) {
		int[] arr1 = {5,2,8};
        int[] arr2 = {1,7,3};
        
        //Ascending
        
        int [] ans= IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
        		.sorted()
        		.toArray();
        
        System.out.println(Arrays.toString(ans));
        
        //Descending
        
        Integer [] revAns= IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
        		.boxed()
        		.sorted(Comparator.reverseOrder())
        		.toArray(Integer[] :: new);
        
        System.out.println(Arrays.toString(revAns));
	}

}
