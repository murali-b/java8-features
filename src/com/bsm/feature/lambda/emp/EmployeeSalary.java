package com.bsm.feature.lambda.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface emp{
boolean test(Employee e);
}
class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class EmployeeSalary {
    public static void main(String args[]){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 80000)
        );
      List<Employee> emplist=  filterEmployees(employees,e->e.salary>60000);
        System.out.println(emplist);
    }
    public static List<Employee> filterEmployees(List<Employee> list, emp condition) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : list) {
            if (condition.test(emp)) {
                result.add(emp);
            }
        }
        return result;
    }
}

