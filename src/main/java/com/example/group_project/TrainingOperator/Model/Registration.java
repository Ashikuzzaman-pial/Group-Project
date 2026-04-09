package com.example.group_project.TrainingOperator.Model;

public class Registration {
    public Registration(int employeeId, int trainingId) {
        this.employeeId = employeeId;
        this.trainingId = trainingId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "employeeId=" + employeeId +
                ", trainingId=" + trainingId +
                '}';
    }

    private int employeeId;
    private int trainingId;
}
