package com.example.group_project.FactoryRepresentative.Model;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private String contact;
    private String designation;
    private String factory;

    public Employee() {}

    public Employee(int id, String name, String contact, String designation, String factory) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.designation = designation;
        this.factory = factory;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getDesignation() { return designation; }
    public String getFactory() { return factory; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", designation='" + designation + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }
}