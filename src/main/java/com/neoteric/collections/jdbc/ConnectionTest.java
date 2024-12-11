package com.neoteric.collections.jdbc;

import java.util.Iterator;
import java.util.List;

public class ConnectionTest {

    public static void main(String[] args) {
     /*   JdbcConnection jdbcConnection = new JdbcConnection();

        List<Project> projects = jdbcConnection.getEmpAllocation();

        Iterator<Project> projectIterator = projects.iterator();
        while (projectIterator.hasNext()) {
            Project project = projectIterator.next();
            System.out.println("Project ID: " + project.getProjectId());
            //  System.out.println("Project Name: " + project.getProjectName());
            System.out.println("Employees: ");

            Iterator<Employee> employeeIterator = project.getEmployees().iterator();
            while (employeeIterator.hasNext()) {
                Employee employee = employeeIterator.next();
                System.out.println("  Employee ID: " + employee.getId());
                System.out.println("  Employee Name: " + employee.getName());
            //    System.out.println("  Department: " + employee.getDept());
            }
            System.out.println("---------------");
        }  */



        SelfJoin selfJoin = new SelfJoin();
        List<Manager> managers = selfJoin.getEmpAllocation();

        if (managers.isEmpty()) {
            System.out.println("No data found.");
        } else {
            for (Manager manager : managers) {
                System.out.println("Manager: " + manager.getName());
                System.out.println("Employees:");
                for (Employee employee : manager.getEmployees()) {
                    System.out.println("  - ID: " + employee.getId() + ", Name: " + employee.getName());
                }
                System.out.println("---------------------------------------");
            }
        }

    }
}
