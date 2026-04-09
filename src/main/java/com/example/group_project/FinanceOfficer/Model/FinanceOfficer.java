package com.example.group_project.FinanceOfficer.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class FinanceOfficer {
    public FinanceOfficer(int officerId, String email) {
        this.officerId = officerId;
        this.email = email;
    }

    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FinanceOfficer{" +
                "officerId=" + officerId +
                ", email='" + email + '\'' +
                '}';
    }

    private int officerId;
    private String email;

    private static ObservableList<Fund> ADD_FUND_LIST =  FXCollections.observableArrayList();




    public  boolean addFund(int fundId, double amount, LocalDate date){

        Fund newFund = new Fund(
                fundId,
                amount,
                date
        );
        if(ADD_FUND_LIST.add(newFund)){
            return true;

        }
        else{
            return false;
        }

    }
    public ObservableList<Fund> viewAddFund(){
        return ADD_FUND_LIST;

    }
    public boolean updateFund(int fundId, double amount, LocalDate date){
        return true;

    }
    public boolean deleteFund(int fundId){
        return true;

    }

    private static ObservableList<Payment> PAYMENT_LIST =  FXCollections.observableArrayList();

    public boolean processPayment( int applicationId, double amount, LocalDate date) {
        Payment newPayment = new Payment(
                applicationId,
                amount,
                date
        );
        if (PAYMENT_LIST.add(newPayment)) {
            return true;
        } else {
            return false;
        }
    }
    public ObservableList<Payment> viewPayment(){
            return PAYMENT_LIST;
    }

    private static ObservableList<Contribution>CONTRIBUTION_LIST =  FXCollections.observableArrayList();
    public boolean updateContribution(int employeeId,double amount){
        Contribution newContribution = new Contribution(
                employeeId,
                amount
        );
        if(CONTRIBUTION_LIST.add(newContribution)){
            return true;
        }
        else{
            return false;
        }





    }

}
