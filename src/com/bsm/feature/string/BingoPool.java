package com.bsm.feature.string;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.IO.println;

public class BingoPool {

    public static void main(String args[]){
       /* List<String> bingoPool= new ArrayList<>(75);
        int start = 1;
        for(char c:"BINGO".toCharArray()){
            for(int i=start;i<(start+15);i++) {
                bingoPool.add("" + c + i);
                println(""+c+i);
            }
            start+=15;
        }*/
        /*bingoPool.stream()
                .limit(15)
                .filter(s-> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .forEach(System.out::println);*/
        String[] strings={"One","Two","Three"};
        var firstString = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());
        var secondString = Stream.of("six","four","five")
                .map(String::toUpperCase)
                .filter(s->s.indexOf('S') == 0 || s.lastIndexOf("E") == 3);
        Stream.concat(secondString,firstString).forEach(IO::println);

        Map<Character,int[]> myMap = new LinkedHashMap<>();
        int bingoIndex=1;
        for(char c:"BINGO".toCharArray()){
            int[] numbers = new int[15];
            int labelNumber=bingoIndex;
            Arrays.setAll(numbers,i->i+labelNumber);
            myMap.put(c,numbers);
            bingoIndex += 15;
        }
        myMap.entrySet()
                .stream()
                .map(e->e.getKey() +" has range "+e.getValue()[0] +" - "+
                        e.getValue()[e.getValue().length-1])
                .forEach(IO::println);
        Random random = new Random();
        Stream.generate(()->random.nextInt(2))
                .limit(10)
                .forEach(i-> System.out.print(i +" "));
        System.out.println();
        IntStream.iterate(1,n->n+1)
                .limit(100)
                .filter(i-> (i>=2 && (i%2 )== 0))
                .forEach(s->System.out.print(s +" "));
        System.out.println();
        IntStream.iterate(1,n->n+1)
                .filter(i-> (i>=2 && (i%2 )== 0))
                .limit(100)
                .forEach(s->System.out.print(s +" "));
        System.out.println();
        IntStream.iterate(1,n->n<=100,n->n+1)
                .filter(n->n%2 != 0)
                .forEach(s->System.out.print(s+" "));
    }
}
