package com.example.group_project.WelfareOfficer.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class WelfareApplication implements Serializable {

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

    public WelfareApplication(int applicationID, String employeeName, String applicationType,
                              String description, int requestedAmount,
                              LocalDate submissionDate, String status, String rejectionReason) {

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

    public String getApplicationType() {
        return applicationType;
    }

    public int getRequestedAmount() {
        return requestedAmount;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
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