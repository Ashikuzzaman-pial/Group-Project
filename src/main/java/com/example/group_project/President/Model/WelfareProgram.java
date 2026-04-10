package com.example.group_project.President.Model;

public class WelfareProgram {
    private int programID;
    private String programName;
    private String description;
    private int budget;
    private String eligibilityCriteria;
    private Boolean isActive;

    public WelfareProgram() {
    }

    public WelfareProgram(int programID, String programName, String description, int budget, String eligibilityCriteria, Boolean isActive) {
        this.programID = programID;
        this.programName = programName;
        this.description = description;
        this.budget = budget;
        this.eligibilityCriteria = eligibilityCriteria;
        this.isActive = isActive;
    }

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
