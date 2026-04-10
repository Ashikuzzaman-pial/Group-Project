package com.example.group_project.TrainingOperator.Controller;
import com.example.group_project.TrainingOperator.Model.TrainingSession;
import javafx.event.*;
import javafx.scene.control.*;

public class DeleteTrainingSessionController
{
    @javafx.fxml.FXML
    private TextField trainingIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void deleteOnActionButton(ActionEvent actionEvent) {

        int trainingId = Integer.parseInt(trainingIDTextField.getText());






    }
}