package com.example.group_project.FactoryRepresentative.Model;

public class Factory {
    private int id;
    private String name;
    private String location;

    public Factory() {
    }

    public Factory(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
}