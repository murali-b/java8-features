package com.bsm.feature.lambda;

import java.util.function.BiFunction;

@FunctionalInterface
interface MyInterface{
    void display();
}
@FunctionalInterface
interface Addition{
    int add(int a, int b);
}
@FunctionalInterface
interface Multiplication{
    int add(int a, int b);
}
@FunctionalInterface
interface Power{
    int add(int a, int b);
}
class Calculator {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int power(int a,int b){
        return (int)Math.pow(a,b);
    }

}
class CalculatorIM {
    int i;
    int j;
    public CalculatorIM(int i, int j) {
        this.i=i;
        this.j=j;
    }

    public  int sum(int a, int b){
        return a+b;
    }
    public  int mul(int a,int b){
        return a*b;
    }
    public  int power(int a,int b){
        return (int)Math.pow(a,b);
    }

}
public class ManagerLambda {
    public void instanceMethod(){
        System.out.println("instanceMethod");
    }
    public int add(int a, int b){
        return a+b;
    }
    void main(){
        ManagerLambda manage= new ManagerLambda();
        BiFunction<Integer, Integer, CalculatorIM> aNew = CalculatorIM::new;
        int add=aNew.apply(10,20).sum(10,30);
        int mul=aNew.apply(10,20).mul(10,30);
        int pow=aNew.apply(10,20).power(10,30);
        System.out.println("add : "+add +" mul : "+ mul+" pow : "+pow);

        Addition additionL = (a,b)->a+b;
        System.out.println(additionL.add(10,20));

        Addition additionCM_sum = Calculator::sum;
        System.out.println(additionCM_sum.add(10,20));

        Addition additionI = Integer::sum;
        System.out.println(additionI.add(10,20));

        Addition additionML = (a,b)->a*b;
        System.out.println(additionML.add(10,20));
        Integer in = new Integer(10);
        System.out.println(in.compareTo(10));
        Addition additionCM_IM= Integer::compare;
        System.out.println(additionCM_IM.add(10,20));

        Addition additionCM_mul= Calculator::mul;
        System.out.println(additionCM_mul.add(10,20));

        Addition additionCM_power = Calculator::power;
        System.out.println(additionCM_power.add(10,20));


      /*  */

    }
}
