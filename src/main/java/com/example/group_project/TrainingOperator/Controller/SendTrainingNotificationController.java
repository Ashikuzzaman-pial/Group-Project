package com.example.group_project.TrainingOperator.Controller;
import com.example.group_project.TrainingOperator.Model.Notification;
import javafx.event.*;
import javafx.scene.control.*;

public class SendTrainingNotificationController
{
    @javafx.fxml.FXML
    private TextArea messageContentTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendOnActionButton(ActionEvent actionEvent) {
        String msgContent = messageContentTextArea.getText();
        Notification notification = new Notification(msgContent);
    }
}