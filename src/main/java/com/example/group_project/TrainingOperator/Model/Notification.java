package com.example.group_project.TrainingOperator.Model;

public class Notification {
    public Notification(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "msgContent='" + msgContent + '\'' +
                '}';
    }

    private String msgContent;
}
