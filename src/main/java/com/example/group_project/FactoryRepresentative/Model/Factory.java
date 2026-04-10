package com.example.group_project.FactoryRepresentative.Model;

public class Factory {

    private String name;
    private String address;
    private String contact;

    public Factory() {
    }

    public Factory(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }
}