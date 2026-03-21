package com.bsm.feature.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class FirstNoNRepeatingChar {


    void main(){
      //  println("Hello to java 21");
       //println(findFirstNonRepChar("test the application"));
        println(findFirstNonRepChar("tt"));
    /*   println(findFirstNonRepChar("t"));
       println(findFirstNonRepChar("tt"));
        println(findFirstNonRepChar("the"));
        println(findFirstNonRepChar(" "));
        println(findFirstNonRepChar(null));*/
       // System.out.println('a');
    }

  /*  void main(){
        System.out.println("Hello to All");
    }*/
    String findFirstNonRepCharN(String word){ //O(n power 2)
        if(word == null || word.isBlank()){
            return "Invalid Word";
        }
        int size=word.length();
        if(size==1){
            return "First non repeating char :: "+word;
        }
        String repChar="";
        for(int i=0;i < size;i++){
            boolean found=false;
            int count=0;
            for(int j=0;j<size;j++){
                if(i !=j  && word.charAt(i) == word.charAt(j)){
                    found=true;
                    count++;
                }else if(i != j) {
                        found = false;
                }
            }
            if(!found && count==0) {
                repChar = "first non repeating character :: "+word.charAt(i);
             break;
            } else{
                repChar="All are having repeating chars";
            }
        }
        return repChar;
    }

    public String findFirstNonRepChar(String word) {
        if(word == null || word.isBlank()){
            return "Invalid Word";
        }
        if(word.length()==1){
            return "First non repeating char :: "+word;
        }
        int[] allChars = new int[256];
        for(char c: word.toCharArray()){
            allChars[c]++;
        }
        for(char c: word.toCharArray()){
            if(allChars[c] == 1)
                return "First Non repeating char is :: "+c;
        }
        //checking with streams
        IntStream.range(0,word.length())
                .filter(i->allChars[i]>0)
                .forEach(System.out::println);
      // Arrays.stream(allChars).forEach(value -> println());
        return "Unable to Find non repeating chars";
    }
    public String findFirstNonRepCharStreamWithIntArray(String word) {
        if (word == null || word.isBlank()) return "Invalid Word";

        // 1. Create the frequency map (using an array as the "bucket")
        int[] allChars = new int[256];
        word.chars().forEach(c -> allChars[c]++);

        // 2. Find the first character with a count of 1
        return word.chars()
                .filter(c -> allChars[c] == 1)
                .mapToObj(c -> "First Non repeating char is :: " + (char)c)
                .findFirst()
                .orElse("Unable to Find non repeating chars");
    }
    public String findFirstNonRepCharStream(String word) {
        if (word == null || word.isBlank()) return "Invalid Word";

        // 1. Create the frequency map (using an array as the "bucket")
        int[] allChars = new int[256];
        word.chars().forEach(c -> allChars[c]++);

        // 2. Find the first character with a count of 1
        return word.chars()
                .filter(c -> allChars[c] == 1)
                .mapToObj(c -> "First Non repeating char is :: " + (char)c)
                .findFirst()
                .orElse("Unable to Find non repeating chars");
    }
    public String findFirstNonRepCharStreamMap(String word) {
        if (word == null || word.isBlank()) return "Invalid Word";
            //Arrays.stream(word.toCharArray()).sequential();
            //word.charAt(0);

        word.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        // 1. Group characters and count them
        Map<Character, Long> charCounts = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // Maintains insertion order
                        Collectors.counting()
                ));

        // 2. Find the first entry with a count of 1
        return charCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> "First Non repeating char is :: " + entry.getKey())
                .findFirst()
                .orElse("Unable to Find non repeating chars");
    }
}

