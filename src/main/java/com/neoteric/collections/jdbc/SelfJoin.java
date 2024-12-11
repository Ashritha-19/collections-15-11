package com.neoteric.collections.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelfJoin {

        public List<Manager> getEmpAllocation() {
            List<Manager> managerList = new ArrayList<>();
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "sonar", "sonar");
                Statement statement = connection.createStatement();

                String query = "SELECT m.name AS manager_name, e.empid AS employee_id, e.name AS employee_name " +
                        "FROM employee e " +
                        "JOIN employee m ON e.mid = m.empid";

                ResultSet resultSet = statement.executeQuery(query);

                Map<String, List<Employee>> managerEmployeeMap = new HashMap<>();

                while (resultSet.next()) {
                    String managerName = resultSet.getString("manager_name");
                    int employeeId = resultSet.getInt("employee_id");
                    String employeeName = resultSet.getString("employee_name");

                    Employee employee = new Employee();
                    employee.setId(employeeId);
                    employee.setName(employeeName);

                    managerEmployeeMap
                            .computeIfAbsent(managerName, k -> new ArrayList<>())
                            .add(employee);
                }

                for (Map.Entry<String, List<Employee>> entry : managerEmployeeMap.entrySet()) {
                    Manager manager = new Manager();
                    manager.setName(entry.getKey());
                    manager.setEmployees(entry.getValue());
                    managerList.add(manager);
                }

            } catch (Exception e) {
                System.out.println("Exception occurred while fetching data: " + e);
            }
            return managerList;
        }
}
