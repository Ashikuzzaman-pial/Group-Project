package com.example.group_project.GeneralMember.Model;

import java.time.LocalDateTime;

public class SystemNotification {
    private int notificationID;
    private String recipientID;
    private String content;
    private Boolean isRead;
    private LocalDateTime timestamp;

    public SystemNotification() {
    }

    public SystemNotification(int notificationID, String recipientID, String content, Boolean isRead, LocalDateTime timestamp) {
        this.notificationID = notificationID;
        this.recipientID = recipientID;
        this.content = content;
        this.isRead = isRead;
        this.timestamp = timestamp;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getRecipientID() {
        return recipientID;
    }

    public void setRecipientID(String recipientID) {
        this.recipientID = recipientID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}