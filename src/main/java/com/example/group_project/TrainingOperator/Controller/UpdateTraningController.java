package com.example.group_project.TrainingOperator.Controller;

import javafx.event.*;
import javafx.scene.control.*;

import java.time.LocalDate;

public class UpdateTraningController
{
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private TextField traininIdTextField;
    @javafx.fxml.FXML
    private TextField trainingNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateActionOnButton(ActionEvent actionEvent) {
        int trainingId = Integer.parseInt(traininIdTextField.getText());
        String trainingName = trainingNameTextField.getText();
        String time = timeTextField.getText();
        LocalDate date = datePicker.getValue();



    }
}