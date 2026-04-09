package com.example.group_project.FinanceOfficer.Model;

public class FinansialSummary {
    public FinansialSummary(int totalFund, int totalPayment, int totalContribution, int balance) {
        this.totalFund = totalFund;
        this.totalPayment = totalPayment;
        this.totalContribution = totalContribution;
        this.balance = balance;
    }

    public int getTotalFund() {
        return totalFund;
    }

    public void setTotalFund(int totalFund) {
        this.totalFund = totalFund;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getTotalContribution() {
        return totalContribution;
    }

    public void setTotalContribution(int totalContribution) {
        this.totalContribution = totalContribution;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "FinansialSummary{" +
                "totalFund=" + totalFund +
                ", totalPayment=" + totalPayment +
                ", totalContribution=" + totalContribution +
                ", balance=" + balance +
                '}';
    }

    private int totalFund;
    private int totalPayment;
    private int totalContribution;
    private int balance;
}
