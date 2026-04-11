package com.example.group_project.President.Model;

import com.example.group_project.User;

import java.io.Serializable;

public class President extends User implements Serializable {

    public President() {
    }

    public President(int id, String name, String role, String email, String password) {
        super(id, name, role, email, password);
    }


}
