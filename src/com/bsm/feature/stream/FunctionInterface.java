package com.bsm.feature.stream;

import java.util.function.Function;

public class FunctionInterface {
    static void main() {
        Function<String,String> stringLength = String::toLowerCase;
       // Function<String, Integer> stringLengt = (s)->s.length();
        System.out.println(stringLength.apply("Hello")); // Output: 5
        Function<String,Integer> strLeng = String::length;
        System.out.println(strLeng.apply("return the length"));




    }
}
