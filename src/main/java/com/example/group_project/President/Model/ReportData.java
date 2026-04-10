package com.example.group_project.President.Model;

public class ReportData {
    private String timePeriod;
    private int totalApplications;
    private int approvedCount;
    private int rejectedCount;
    private int deletedCount;

    public ReportData() {
    }

    public ReportData(String timePeriod, int totalApplications, int approvedCount, int rejectedCount, int deletedCount) {
        this.timePeriod = timePeriod;
        this.totalApplications = totalApplications;
        this.approvedCount = approvedCount;
        this.rejectedCount = rejectedCount;
        this.deletedCount = deletedCount;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getTotalApplications() {
        return totalApplications;
    }

    public void setTotalApplications(int totalApplications) {
        this.totalApplications = totalApplications;
    }

    public int getApprovedCount() {
        return approvedCount;
    }

    public void setApprovedCount(int approvedCount) {
        this.approvedCount = approvedCount;
    }

    public int getRejectedCount() {
        return rejectedCount;
    }

    public void setRejectedCount(int rejectedCount) {
        this.rejectedCount = rejectedCount;
    }

    public int getDeletedCount() {
        return deletedCount;
    }

    public void setDeletedCount(int deletedCount) {
        this.deletedCount = deletedCount;
    }
}