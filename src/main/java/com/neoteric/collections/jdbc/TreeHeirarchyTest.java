package com.neoteric.collections.jdbc;

import java.util.List;

public class TreeHeirarchyTest {

    public static void main(String[] args) {
        TreeStructure treeStructure = new TreeStructure();
        Employee ceo = treeStructure.getHierarchy();

        if (ceo == null) {
            System.out.println("No hierarchy found.");
        } else {
            printHierarchy(ceo, 0);
        }
    }

    private static void printHierarchy(Employee employee, int level) {

        System.out.println(" ".repeat(level * 4) + employee.getName() + " (" + employee.getDept() + ")");

        List<Employee> subordinates = employee.getSubordinates();
        for (Employee subordinate : subordinates) {
            printHierarchy(subordinate, level + 1);  // Increased level for indentation
        }
    }
}
