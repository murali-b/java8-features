package com.bsm.feature.string;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Revers {
    public static void main(String args[]){
        String str="Hello";
        //Approach 1
       char[]  charry= str.toCharArray();
       for(int i=str.length()-1;i>=0;i--){
           System.out.print(charry[i]);
       }
        System.out.println("-----------");
        //Approach 2
       for(int i=str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i));
       }
        //Approach 3
        System.out.println("-----------");
       StringBuilder sBuilder = new StringBuilder(str);
        System.out.println(sBuilder.reverse());
        //Approach 4
        System.out.println("-----------");
        StringBuffer sBuffer = new StringBuffer(str);
        System.out.println(sBuffer.reverse());
        //Approach 5
        System.out.println("-----------");
        str.chars().mapToObj(c->(char)c)
                .sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();
        List<Character> charList = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.toList());
        Collections.reverse(charList);
        String reverse=charList.stream()
                        .map(String::valueOf)
                                .collect(Collectors.joining());
        System.out.println(reverse);
        System.out.println();
        String reversed = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream().map(Object::toString).collect(Collectors.joining());
                        }
                ));
        String input = "Hello World";
        String reversed1 = IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());

        String reversed2 = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (s1, s2) -> s2 + s1);
    }
}
