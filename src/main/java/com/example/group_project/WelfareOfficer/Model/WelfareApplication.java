package com.example.group_project.WelfareOfficer.Model;

import com.example.group_project.FactoryRepresentative.Model.Employee;

import java.time.LocalDate;

public class WelfareApplication {
    private int id;
    private Employee employee;
    private String status;
    private LocalDate submissionDate;

    public WelfareApplication() {
    }

    public WelfareApplication(int id, Employee employee, String status, LocalDate submissionDate) {
        this.id = id;
        this.employee = employee;
        this.status = status;
        this.submissionDate = submissionDate;
    }

    public int getId() { return id; }
    public Employee getEmployee() { return employee; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getSubmissionDate() { return submissionDate; }
}
