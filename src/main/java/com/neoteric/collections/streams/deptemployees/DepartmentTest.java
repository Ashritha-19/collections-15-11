package com.neoteric.collections.streams.deptemployees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DepartmentTest {

    public static void main(String[] args) {

        Department itDepartment = new Department("IT", new ArrayList<>());
        itDepartment.add(new Employee("Mahesh", 75000));
        itDepartment.add(new Employee("Churi", 90000));
        itDepartment.add(new Employee("Kalyani", 60000));

        Department financeDepartment = new Department("Finance", new ArrayList<>());
        financeDepartment.add(new Employee("Putty", 80000));
        financeDepartment.add(new Employee("Srikar", 85000));
        financeDepartment.add(new Employee("Krish", 95000));

        Department hrDepartment = new Department("HR", new ArrayList<>());
        hrDepartment.add(new Employee("Dinesh", 55000));
        hrDepartment.add(new Employee("Shriran", 70000));

        List<Department> departments = Arrays.asList(itDepartment, financeDepartment, hrDepartment);

        System.out.println("Average Salary Department-wise:");
        Iterator<Department> avgIterator = departments.iterator();
        while (avgIterator.hasNext()) {
            Department dept = avgIterator.next();
            double avgSalary = dept.getEmployeeList().stream()
                    .mapToDouble(Employee::getSalary)
                    .average()
                    .orElse(0);
            System.out.println(dept.getDeptName() + ": " + avgSalary);
        }

        System.out.println("\nMax Salary Department-wise:");
        Iterator<Department> maxIterator = departments.iterator();
        while (maxIterator.hasNext()) {
            Department dept = maxIterator.next();
            double maxSalary = dept.getEmployeeList().stream()
                    .mapToDouble(Employee::getSalary)
                    .max()
                    .orElse(0);
            System.out.println(dept.getDeptName() + ": " + maxSalary);
        }

        List<Employee> allEmployees = departments.stream()
                .flatMap(dept -> dept.getEmployeeList().stream())
                .collect(Collectors.toList());

        double companyMaxSalary = allEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0);

        double companyMinSalary = allEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0);

        System.out.println("\nCompany-wide Max Salary: " + companyMaxSalary);
        System.out.println("Company-wide Min Salary: " + companyMinSalary);
    }
}
