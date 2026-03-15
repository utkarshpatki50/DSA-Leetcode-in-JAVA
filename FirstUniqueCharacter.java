package com.example.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "aabbcdde";

        Map<Character, Long> map =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
        //map : {a=2, b=2, c=1, d=2, e=1}

        Character result =
                map.entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)         //c=1 , e=1
                        .map(Map.Entry::getKey)
                        .findFirst()                            // c=1
                        .orElse(null);

        System.out.println("First Unique Character : = "+ result);
    }
}