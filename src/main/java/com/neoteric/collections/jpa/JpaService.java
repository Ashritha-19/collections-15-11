package com.neoteric.collections.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class JpaService {

    public List<ProjectEntity> getProjects(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sonar");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
         entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("Select p from ProjectEntity p");

       List<ProjectEntity> projectEntityList = query.getResultList();

       for (ProjectEntity project : projectEntityList){

           System.out.println("Project ID: " + project.getProjectId());
           System.out.println("Project Name: " + project.getProjectName());
           System.out.println("Start Date: " + project.getStartDate());
           System.out.println("End Date: " + project.getEndDate());



           List<EmployeeEntity> employeeEntityList = project.getEmployeeEntity();

           for (EmployeeEntity employee : employeeEntityList){
               System.out.println("  Employee ID: " + employee.getEmpId());
               System.out.println("  Name: " + employee.getName());
               System.out.println("  Department: " + employee.getDept());
               System.out.println("  Salary: " + employee.getSalary());
               System.out.println("  State: " + employee.getState());
           }


       }

       entityManager.getTransaction().commit();

     return  projectEntityList;

    }

}
