package com.example.group_project.TrainingOperator.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TrainingOperator {
    public TrainingOperator(int operatorId, String email) {
        this.operatorId = operatorId;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    @Override
    public String toString() {
        return "TrainingOperator{" +
                "email='" + email + '\'' +
                ", operatorId=" + operatorId +
                '}';
    }

    private String email;
    private int operatorId;

    private static ObservableList<TrainingSession> TRAINING_SESSION_LIST =  FXCollections.observableArrayList() ;


    public static boolean addTrainingSession(int trainingId, String trainingName, LocalDate date, String time){
        TrainingSession newTrainingSession = new TrainingSession(
                trainingId,
                trainingName,
                date,
                time
        );

        if(TRAINING_SESSION_LIST.add(newTrainingSession)){
           return true;
        }
        else{
            return false;
        }
    }

    public static ObservableList<TrainingSession> viewTrainingSession(){
        return TRAINING_SESSION_LIST;

    }
    public boolean updateTrainingSession(int trainingId, String trainingName, LocalDate date, LocalTime time){
        return true;
    }

    private static ObservableList<Registration> REGISTRATION_LIST =  FXCollections.observableArrayList() ;
    public boolean registerEmployeeToTraining(int employeeId,int trainingId){
        Registration newRegistration = new Registration(
                employeeId,
                trainingId
        );
        if(REGISTRATION_LIST.add(newRegistration)){
            return true;
        }
        else{
            return false;
        }



    }
    public ObservableList<Registration> viewRegistrationEmployeeList(){
        return REGISTRATION_LIST;
    }
    public boolean updateAttendanceStatus(int attendanceId,int trainingId){
        return true;

    }

    public boolean sendNotification(String msgContent){
    return true;
    }
}
