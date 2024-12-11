package com.neoteric.collections.jpa;

import jakarta.persistence.*;

@Entity
@Table(schema = "sonar", name = "employee")
public class EmployeeEntity {

    public EmployeeEntity(){

    }

    @Id
    @Column(name = "empid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "name")
    private String name;

    @Column(name = "dept")
    private String dept;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "state")
    private String state;

   // private int mid;

    @Column(name = "pid", insertable = false, updatable = false)
    private int pid;


    @ManyToOne()
    @JoinColumn(name = "pid", referencedColumnName = "project_id")
    private ProjectEntity projectEntity;




    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

 /*   public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }*/

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

   public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
