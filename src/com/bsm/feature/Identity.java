package com.bsm.feature;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class Identity {
    void main(){
       List<String> list = List.of("Murali","Mohan","Vishnu","Rohan","Sudharshan","Murali","Mohan","Vishnu","Rohan","Sudharshan");

     /*Map<String,Integer> map =  list.stream()
               .collect(Collectors.toMap(Function.identity(),String::length));
     map.forEach((key,value)-> System.out.println(key+" "+value));
        System.out.println("-----------------");
     Map<String,List<String>> counts = list.stream()
             .collect(Collectors.groupingBy(Function.identity(),Collectors.filtering(word->word.startsWith("M"),Collectors.toList())));
     counts.forEach((key,value)-> System.out.println(key+" "+value));*/

     list.stream().map(String::toUpperCase)
             .collect(Collectors.groupingBy(Function.identity()))
             .forEach((key,value)->{
                 System.out.println(key);
                 System.out.println(value.get(0));
             });
            /* .entrySet().stream()
             .forEach(enty->{
                 System.out.println(enty.getKey());
                 System.out.println(enty.getValue());

             });*/


    }
}
