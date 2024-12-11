package com.neoteric.collections.jpa;

import java.util.List;

public class JpaEmployeeTest {
    public static void main(String[] args) {

        JpaEmployeeService jpaEmployeeService = new JpaEmployeeService();
        List<EmployeeEntity> employeeEntities = jpaEmployeeService.getEmployeeList();

        for (EmployeeEntity employeeEntity: employeeEntities){
            System.out.println("Employee id:"+ employeeEntity.getEmpId());
        }
        
    }
}
