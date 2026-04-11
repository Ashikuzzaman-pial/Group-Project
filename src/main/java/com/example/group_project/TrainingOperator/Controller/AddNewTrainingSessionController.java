package com.example.group_project.TrainingOperator.Controller;

import com.example.group_project.TrainingOperator.Model.TrainingOperator;
import com.example.group_project.TrainingOperator.Model.TrainingSession;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class AddNewTrainingSessionController
{
    @javafx.fxml.FXML
    private TextField txtTrainingName;
    @javafx.fxml.FXML
    private TextField txtTrainingID;
    @javafx.fxml.FXML
    private TextField txtTime;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    public static ArrayList<TrainingSession> trainingSessions = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {


    }
    //ArrayList<Registration> registrationList = new ArrayList<>();

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
        String trainingName = txtTrainingName.getText();
        int trainingId = Integer.parseInt(txtTrainingID.getText());
        LocalDate date = datePicker.getValue();
        String time = txtTime.getText();

        TrainingSession newTrainingSession = new TrainingSession(trainingId, trainingName, date, time);

        trainingSessions.add(newTrainingSession);


    }
}