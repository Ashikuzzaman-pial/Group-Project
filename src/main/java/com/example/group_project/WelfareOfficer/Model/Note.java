package com.example.group_project.WelfareOfficer.Model;

import java.io.Serializable;

public class Note implements Serializable {
    private int id;
    private WelfareApplication application;
    private String content;

    public Note() {
    }

    public Note(int id, WelfareApplication application, String content) {
        this.id = id;
        this.application = application;
        this.content = content;
    }

    public int getId() { return id; }
    public WelfareApplication getApplication() { return application; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}