package com.neoteric.collections.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class TreeStructure {
    public Employee getHierarchy() {
        Employee ceo = null;
        Map<Integer, Employee> employeeMap = new HashMap<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "sonar", "sonar");
            Statement statement = connection.createStatement();

            String query = "SELECT empid, name, dept, salary, state, pid, mid FROM employee";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int empId = resultSet.getInt("empid");
                String name = resultSet.getString("name");
                String dept = resultSet.getString("dept");
                double salary = resultSet.getDouble("salary");
                String state = resultSet.getString("state");
                int pid = resultSet.getInt("pid");
                Integer mid = resultSet.getObject("mid", Integer.class);

                Employee employee = employeeMap.getOrDefault(empId, new Employee());
                employee.setId(empId);
                employee.setName(name);
                employee.setDept(dept);
                employee.setSalary(salary);
                employee.setState(state);
                employee.setPid(pid);
                employee.setMid(mid);

                employeeMap.put(empId, employee);

                if (mid == null) {

                } else {

                    Employee manager = employeeMap.getOrDefault(mid, new Employee());
                    manager.setId(mid);
                    employeeMap.put(mid, manager);

                    manager.addSubordinate(employee);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while fetching data: " + e.getMessage());
        }

        return ceo;
    }

}
