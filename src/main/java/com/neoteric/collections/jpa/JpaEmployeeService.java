package com.neoteric.collections.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class JpaEmployeeService {

    List<EmployeeEntity> getEmployeeList(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sonar");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select e from EmployeeEntity e");

        List<EmployeeEntity> employeeEntityList = query.getResultList();

        entityManager.getTransaction().commit();

        return employeeEntityList;

    }



}
