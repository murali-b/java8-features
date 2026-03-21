package com.bsm.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class Instructor {
    private String name;
    private String gender;
    private double salary;
    public Instructor(){

    }
    public Instructor(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public List<Instructor> getAll(){
        List<Instructor> list =new ArrayList<>();
        list.add(new Instructor("Murali","M",200000));
        list.add(new Instructor("Mohar","M",250000));
        list.add(new Instructor("Roja","f",400000));

        return list;
    }
}

public class BiConsumerTest {
    public static void main(String args[]){
        Instructor instructors = new Instructor();

        BiConsumer<String,String> biCosumer = (x,y)-> System.out.println("Name :: "+x+" :: "+"Age :: "+y);
        instructors.getAll().forEach(
                instructor -> {
                    biCosumer.accept(instructor.getName(), instructor.getGender());
                } );
    }

}
