package com.neoteric.collections.streams.deptemployees;

public class Employee {

    private String name;

    private double salary;

   // private String department;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
       // this.department = department;
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

   /* public String getDepartment(){
        return department;
    } */

}
