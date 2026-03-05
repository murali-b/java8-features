package com.bsm.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class Employee{
    private String name;
    private double salary;
    private Integer empNumber;
    private Integer deptId;

    public Employee(String name, double salary, int deptId, int empNumber) {
        this.name = name;
        this.salary = salary;
        this.deptId = deptId;
        this.empNumber = empNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empNumber=" + empNumber +
                ", deptId=" + deptId +
                '}';
    }
}
public class EmpNamesGroupByDptID {
    static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("smith", 150000, 2, 1),
                new Employee("ram", 250000, 1, 2),
                new Employee("kiran", 150000, 2, 3),
                new Employee("syam", 150000, 2, 4),
                new Employee("ranga", 250000, 1, 5),
                new Employee("syam1", 150000, 2, 6),
                new Employee("ranga1", 250000, 1, 7));
       /*Map<Integer,List<Employee>> empMap = list
               .stream().collect(Collectors.groupingBy(Employee::getDeptId));
        System.out.println(empMap);*/
        //{1=[Employee{name='ram', salary=250000.0, empNumber=2, deptId=1}, Employee{name='ranga', salary=250000.0, empNumber=5, deptId=1}], 2=[Employee{name='smith', salary=150000.0, empNumber=1, deptId=2}, Employee{name='kiran', salary=150000.0, empNumber=3, deptId=2}, Employee{name='syam', salary=150000.0, empNumber=4, deptId=2}]}
       /* Map<Integer,List<String>> groupingByEmpNames = list.stream().
        collect(groupingBy(Employee::getDeptId,mapping(Employee::getName,toList())));
        System.out.println(groupingByEmpNames);*/

       /* Map<Integer, Set<String>> groupingByUniqEmpNames = list.stream().
                collect(groupingBy(Employee::getDeptId,mapping(Employee::getName,toSet())));
        System.out.println(groupingByUniqEmpNames);*/
        List<Department> listDep = Arrays.asList(new Department(1,"IT"),new Department(1,"BPO"));


    }
}
class Department{
    private int dept_no;
    private String dept_name;

    public Department(int dept_no, String dept_name) {
        this.dept_no = dept_no;
        this.dept_name = dept_name;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_no=" + dept_no +
                ", dept_name='" + dept_name + '\'' +
                '}';
    }
}
