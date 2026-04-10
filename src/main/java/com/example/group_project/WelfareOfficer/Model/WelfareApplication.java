package com.example.group_project.WelfareOfficer.Model;

import java.time.LocalDate;

public class WelfareApplication {
    private int applicationID;
    private String employeeName;
    private String applicationType;
    private String description;
    private int requestedAmount;
    private LocalDate submissionDate;
    private String status;
    private String rejectionReason;

    public WelfareApplication() {
    }

    public WelfareApplication(int applicationID, String employeeName, String applicationType, String description, int requestedAmount, LocalDate submissionDate, String status, String rejectionReason) {
        this.applicationID = applicationID;
        this.employeeName = employeeName;
        this.applicationType = applicationType;
        this.description = description;
        this.requestedAmount = requestedAmount;
        this.submissionDate = submissionDate;
        this.status = status;
        this.rejectionReason = rejectionReason;
    }

    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(int requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
}