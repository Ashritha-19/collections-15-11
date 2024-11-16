package com.neoteric.collections.typendobject.treeandhash;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        TreeMap<Integer, Employee> employeeTreeMap = new TreeMap<>();
        employeeTreeMap.put(01, new Employee(01,"Krish","IT"));
        employeeTreeMap.put(02, new Employee(02,"Ashri","Hr"));
        employeeTreeMap.put(03, new Employee(03,"ShriRan","Business"));


        for (Integer id : employeeTreeMap.keySet()){
            System.out.println(employeeTreeMap.get(id));
        }

        System.out.println(employeeTreeMap.get(01));

        employeeTreeMap.remove(02);
        System.out.println("After removing an id :02");
        for (Integer id : employeeTreeMap.keySet()){
            System.out.println(employeeTreeMap.get(id));
        }
    }
}
