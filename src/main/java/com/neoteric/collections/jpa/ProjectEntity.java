package com.neoteric.collections.jpa;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "sonar", name = "project")
public class ProjectEntity {

    public ProjectEntity(){

    }


    @Id
    @Column(name = "project_id")
    private int projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;


    @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<EmployeeEntity> employeeEntity;


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<EmployeeEntity> getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(List<EmployeeEntity> employeeEntity) {
        this.employeeEntity = employeeEntity;
    }
}
