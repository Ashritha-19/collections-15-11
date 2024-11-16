package com.neoteric.collections.collections.treeandhash;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {

                HashMap<Integer, Employee> employees = new HashMap<>();

                employees.put(101, new Employee(101, "Krish", "HR"));
                employees.put(102, new Employee(102, "Ashri", "Finance"));
                employees.put(103, new Employee(103, "ADS", "IT"));

                for (Integer id : employees.keySet()) {
                    System.out.println(employees.get(id));
                }

                System.out.println("\nDetails of Employee with ID 102:");
                System.out.println(employees.get(102));

                System.out.println("\nUpdating department of Employee with ID 103...");
                Employee emp = employees.get(103);
                if (emp != null) {
                    emp.setDepartment("Engineering");
                    employees.put(103, emp);                }
                System.out.println("Updated Employee Record: " + employees.get(103));

                System.out.println("\nRemoving Employee with ID 101...");
                employees.remove(101);


                System.out.println("\nEmployee Records After Removal:");
                for (Integer id : employees.keySet()) {
                    System.out.println(employees.get(id));
                }
            }
        }

