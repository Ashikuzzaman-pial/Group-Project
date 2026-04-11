package com.example.group_project.GeneralMember.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Inquiry implements Serializable {
    private int inquiryID;
    private String senderID;
    private String subject;
    private String message;
    private LocalDateTime timestamp;

    public Inquiry() {
    }

    public Inquiry(int inquiryID, String senderID, String subject, String message, LocalDateTime timestamp) {
        this.inquiryID = inquiryID;
        this.senderID = senderID;
        this.subject = subject;
        this.message = message;
        this.timestamp = timestamp;
    }

    public int getInquiryID() {
        return inquiryID;
    }

    public void setInquiryID(int inquiryID) {
        this.inquiryID = inquiryID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}