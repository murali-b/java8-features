package com.bsm.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<String> startsWithA = (str) -> str.startsWith("A");
        Predicate<String> endsWithX = (str) -> str.endsWith("X");
        System.out.println("startsWithA"+startsWithA.test("hello"));
        Predicate<String> startsWithAAndEndsWithX = startsWithA.and(endsWithX);
        System.out.println(startsWithAAndEndsWithX.test("AX")); // Output: true
        System.out.println(startsWithAAndEndsWithX.test("AB"));
        Predicate<String> startsWithAOrEndsWithX = startsWithA.or(endsWithX);
        System.out.println(startsWithAOrEndsWithX.test("BXC"));

        // Negate a predicate
        Predicate<String> notStartsWithA = startsWithA.negate();
        System.out.println(notStartsWithA.test("Banana"));
        System.out.println(notStartsWithA.test("A Banana"));
        Predicate<Integer> evenNumberCheck = (i)->{
            i=i%2;
            if(i==0){
                return true;
            } else{
                return false;
            }
        };
        evenNumberCheck.test(20);
        Function<Integer, Integer> integerIntegerFunction = Integer::intValue;
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        // Filter names that start with "A" using a lambda predicate in the filter() method
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        List<String> filteredNameL= names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        names.stream();
    }
}
