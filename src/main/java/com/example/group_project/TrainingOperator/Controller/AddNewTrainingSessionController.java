package com.example.group_project.TrainingOperator.Controller;

import com.example.group_project.TrainingOperator.Model.TrainingOperator;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class AddNewTrainingSessionController
{
    @javafx.fxml.FXML
    private TextField txtTrainingName;
    @javafx.fxml.FXML
    private TextField txtTrainingID;
    @javafx.fxml.FXML
    private DatePicker Datepicker;
    @javafx.fxml.FXML
    private TextField txtTime;

    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
        String trainingName = txtTrainingName.getText();
        int trainingId =  Integer.parseInt( txtTrainingID.getText());
        String time = txtTime.getText();
        LocalDate date = Datepicker.getValue();
        TrainingOperator.addTrainingSession(trainingId,trainingName,date,time);
    }
}