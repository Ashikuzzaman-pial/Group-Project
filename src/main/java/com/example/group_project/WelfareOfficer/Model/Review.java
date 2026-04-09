package com.example.group_project.WelfareOfficer.Model;

public class Review {
    private int id;
    private User officer;
    private WelfareApplication application;
    private String comments;

    public Review() {
    }

    public Review(int id, User officer, WelfareApplication application, String comments) {
        this.id = id;
        this.officer = officer;
        this.application = application;
        this.comments = comments;
    }

    public int getId() { return id; }
    public User getOfficer() { return officer; }
    public WelfareApplication getApplication() { return application; }
    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}