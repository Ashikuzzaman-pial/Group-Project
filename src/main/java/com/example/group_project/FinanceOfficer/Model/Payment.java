package com.example.group_project.FinanceOfficer.Model;

import java.time.LocalDate;

public class Payment {
    public Payment(int applicationId, double amount, LocalDate date) {
        this.applicationId = applicationId;
        this.amount = amount;
        this.date = date;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "applicationId=" + applicationId +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    private int applicationId;
    private double amount;
    private LocalDate date;
}
