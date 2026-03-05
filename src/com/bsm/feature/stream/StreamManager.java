package com.bsm.feature.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamManager {
    static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.stream();
        list.parallelStream();
        Set<Object> set = new HashSet<>();
        set.stream();
        set.parallelStream();
        Map <Object,Object> map = new HashMap<>();

        List<String> listOfStrings = Arrays.asList("a", "b");
        Stream<String> stream = listOfStrings.stream();

        String[] array = {"a", "b"};
        Stream<String> sArrayStream = Arrays.stream(array);

        Stream<String> streamOf = Stream.of("a", "b");
        //Stream.iterate();
        Stream.iterate(0, n -> n + 1) // Start at 0, increment by 1
                .limit(10)               // Limit to the first 10 elements
                .forEach(System.out::println); // Print each element

        Stream.iterate(1, n -> n + 2) // Start at 1, add 2 for each subsequent number
                .limit(10)               // Limit to the first 10 elements
                .forEach(System.out::println);
        //java 9
        // iterate(seed, hasNext condition, next function)
        Stream.iterate(1, n -> n < 20, n -> n * 2)
                .forEach(System.out::println);
        Stream.iterate(0, n -> n < 5, n -> n + 1)
                .forEach(System.out::println);
       // Stream.generate();
       // Files.lines(Path path)
        //IntStream for int values.
      //  LongStream for long values.
      //  DoubleStream for double values.
       // You can obtain a general-purpose Stream of objects from a Java IntStream using the boxed() or mapToObj() methods.

        IntStream intStream = IntStream.range(1, 6); // Creates a stream of 1, 2, 3, 4, 5
        Stream<Integer> integerStream = intStream.boxed();

// You can then use methods available on a general Stream, like collecting to a List
        List<Integer> listIntegers = integerStream.collect(Collectors.toList());
        System.out.println(listIntegers); // Output: [1, 2, 3, 4, 5]
    }

}
