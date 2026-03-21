package com.bsm.feature;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

class Employee{
    public String name="Murali";
}
public class ConsumerTest {
    static void main() {
        Consumer<Employee> EConsumer = (x)-> System.out.println(x.name);
        AtomicInteger length= new AtomicInteger();
      //  EConsumer.accept(new Employee());
        List<String> list = Arrays.asList("Murali","Mohan","Vishnu","Rohan","Sudharshan Reddy");
        Consumer<String> SConsumer =(x)-> {
            System.out.println("Hello");
            length.set(x.length());
        };
        list.forEach(SConsumer);
        System.out.println(length.get());
       /* Consumer<String> length=(x)->{
            System.out.printl(x.length())
        };*/
    }
}
