package com.example.group_project.GeneralMember;

import com.example.group_project.User;

import java.io.Serializable;

public class GeneralMember extends User implements Serializable {

    public GeneralMember() {
    }

    public GeneralMember(int id, String name, String role, String email, String password) {
        super(id, name, role, email, password);
    }

}
