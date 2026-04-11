package com.example.group_project.FactoryRepresentative.Model;

import com.example.group_project.User;

public class FactoryRepresentative extends User {

    private String factoryName;

    public FactoryRepresentative() {
    }

    public FactoryRepresentative(int id, String name, String email, String password, String factoryName) {
        super(id, name, "Factory Representative", email, password);
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }
}