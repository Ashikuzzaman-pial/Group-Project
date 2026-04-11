package com.example.group_project.WelfareOfficer.Model;

import com.example.group_project.User;

public class WelfareOfficer extends User {

    private String department;

    public WelfareOfficer() {
    }

    public WelfareOfficer(int id, String name, String email, String password, String department) {
        super(id, name, "Welfare Officer", email, password);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}