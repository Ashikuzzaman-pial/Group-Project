package com.example.group_project.TrainingOperator.Controller;
import com.example.group_project.TrainingOperator.Model.Registration;
import javafx.event.*;
import javafx.scene.control.*;

import java.util.ArrayList;

public class RegisterTrainingSessionController
{
    @javafx.fxml.FXML
    private TextField trainingIdTextfield;
    @javafx.fxml.FXML
    private TextField employeeIdTextField;

    @javafx.fxml.FXML
    public void initialize() {

    }
     ArrayList<Registration> registrations = new ArrayList<>();



    @javafx.fxml.FXML
    public void registerActionOnButton(ActionEvent actionEvent) {
        int trainingId = Integer.parseInt(trainingIdTextfield.getText());
        int employeeId = Integer.parseInt(employeeIdTextField.getText());
        //TrainingSession trainingSession = new TrainingSession(id, name, date, time);
        Registration registration = new Registration(employeeId,trainingId);
    }
}