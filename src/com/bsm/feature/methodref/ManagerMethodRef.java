package com.bsm.feature.methodref;
@FunctionalInterface
interface MyInterface{
    void display();
}
@FunctionalInterface
interface testInterface{
    int add(int a, int b);
}
public class ManagerMethodRef {
    public void instanceMethod(){
        System.out.println("instanceMethod");
    }
    public int add(int a, int b){
        return a+b;
    }
    void main(){
        ManagerMethodRef manage= new ManagerMethodRef();
        MyInterface instanceMethod = manage::instanceMethod;
        /*testInterface hello = manage::instanceMethod;
        hello.hello();*/
        instanceMethod.display();
        System.out.println(manage.add(10,20));
        testInterface add=manage::add;
        System.out.println(add.add(20,30));
    }
}
