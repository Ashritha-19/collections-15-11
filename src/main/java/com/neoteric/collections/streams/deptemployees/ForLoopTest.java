package com.neoteric.collections.streams.deptemployees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoopTest {

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
            for (int i = 0; i < departments.size(); i++) {
                Department dept = departments.get(i);
                List<Employee> employees = dept.getEmployeeList();

                double totalSalary = 0;
                for (int j = 0; j < employees.size(); j++) {
                    totalSalary += employees.get(j).getSalary();
                }

                double avgSalary = employees.size() > 0 ? totalSalary / employees.size() : 0;
                System.out.println(dept.getDeptName() + ": " + avgSalary);
            }

            System.out.println("\nMax Salary Department-wise:");
            for (int i = 0; i < departments.size(); i++) {
                Department dept = departments.get(i);
                List<Employee> employees = dept.getEmployeeList();

                double maxSalary = 0;
                for (int j = 0; j < employees.size(); j++) {
                    double salary = employees.get(j).getSalary();
                    if (salary > maxSalary) {
                        maxSalary = salary;
                    }
                }

                System.out.println(dept.getDeptName() + ": " + maxSalary);
            }

            List<Employee> allEmployees = new ArrayList<>();
            for (int i = 0; i < departments.size(); i++) {
                allEmployees.addAll(departments.get(i).getEmployeeList());
            }

            double companyMaxSalary = 0;
            double companyMinSalary = allEmployees.size() > 0 ? allEmployees.get(0).getSalary() : 0;

            for (int i = 0; i < allEmployees.size(); i++) {
                double salary = allEmployees.get(i).getSalary();

                if (salary > companyMaxSalary) {
                    companyMaxSalary = salary;
                }

                if (salary < companyMinSalary) {
                    companyMinSalary = salary;
                }
            }

            System.out.println("\nCompany-wide Max Salary: " + companyMaxSalary);
            System.out.println("Company-wide Min Salary: " + companyMinSalary);
        }
}
