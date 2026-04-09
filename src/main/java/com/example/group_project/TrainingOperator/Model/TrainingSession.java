package com.example.group_project.TrainingOperator.Model;

import java.time.LocalDate;

public class TrainingSession {
    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private int trainingId;
    private String trainingName;
    private LocalDate date;
    private String time;

    public TrainingSession(int trainingId, String trainingName, LocalDate date, String time) {
        this.trainingId = trainingId;
        this.trainingName = trainingName;
        this.date = date;
        this.time = time;
    }
}
