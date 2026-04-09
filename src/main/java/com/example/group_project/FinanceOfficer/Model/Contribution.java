package com.example.group_project.FinanceOfficer.Model;

public class Contribution {
    public Contribution(int employeeId, double amount) {
        this.employeeId = employeeId;
        this.amount = amount;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Contribution{" +
                "employeeId=" + employeeId +
                ", amount=" + amount +
                '}';
    }

    private int employeeId;
    private double amount;
}
