package com.example.group_project.FinanceOfficer.Model;

import java.time.LocalDate;

public class Fund {
    public Fund(int fundId, double amount, LocalDate date) {
        this.fundId = fundId;
        this.amount = amount;
        this.date = date;
    }

    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
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
        return "AddFund{" +
                "fundId=" + fundId +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    public int fundId;
    public double amount;
    public LocalDate date;
}
