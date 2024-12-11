package com.neoteric.collections.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class JdbcConnection {

    public List<Project> getEmpAllocation() {
        List<Project> projectList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "sonar", "sonar");
            Statement statement = connection.createStatement();
            String query = "SELECT p.project_id, p.project_name, e.empid AS employee_id, e.name AS employee_name " +
                    "FROM project p " +
                    "JOIN employee e ON p.project_id = e.pid";

            ResultSet resultSet = statement.executeQuery(query);

            Map<Integer, List<Employee>> projectEmployeeMap = new HashMap<>();

            while (resultSet.next()) {
                int projectId = resultSet.getInt("project_id");
                String projectName = resultSet.getString("project_name");
                int employeeId = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");

                Project project = new Project();
                project.setProjectId(projectId);
                project.setProjectName(projectName);

                Employee employee = new Employee();
                employee.setId(employeeId);
                employee.setName(employeeName);

                projectEmployeeMap
                        .computeIfAbsent(projectId, k -> new ArrayList<>())
                        .add(employee);
            }
            Iterator<Map.Entry<Integer, List<Employee>>> iterator = projectEmployeeMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, List<Employee>> entry = iterator.next();
                Project project = new Project();
                project.setProjectId(entry.getKey());
                project.setProjectName(entry.getValue().get(0).getDept());
                project.setEmployees(entry.getValue());
                projectList.add(project);
            }

        } catch (Exception e) {
            System.out.println("Exception occurred while fetching data: " + e);
        }
        return projectList;
    }
}
