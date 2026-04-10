package com.example.group_project.President.Model;

public class ClarificationRequest {
    private int requestID;
    private int relatedApplicationID;
    private String senderID;
    private String receiverID;
    private String subject;
    private String messageBody;
    private String status;

    public ClarificationRequest() {
    }

    public ClarificationRequest(int requestID, int relatedApplicationID, String senderID, String receiverID, String subject, String messageBody, String status) {
        this.requestID = requestID;
        this.relatedApplicationID = relatedApplicationID;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.subject = subject;
        this.messageBody = messageBody;
        this.status = status;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getRelatedApplicationID() {
        return relatedApplicationID;
    }

    public void setRelatedApplicationID(int relatedApplicationID) {
        this.relatedApplicationID = relatedApplicationID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}