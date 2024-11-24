package com.neoteric.collections.streams.deptemployees;

import com.neoteric.collections.streams.flatmap.Subjects;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String deptName;

    List<Employee> employeeList = new ArrayList<>();

    public Department(String deptName, List<Employee> employeeList) {
        this.deptName = deptName;
        this.employeeList = employeeList;
    }

    public String getDeptName() {
        return deptName;
    }


    public void add(Employee employee){
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
