package com.example.group_project.TrainingOperator.Controller;

import com.example.group_project.TrainingOperator.Model.TrainingOperator;
import com.example.group_project.TrainingOperator.Model.TrainingSession;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TrainingSessionListController
{
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> dateTableView;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> trainingNameTableView;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> timeTableView;
    @javafx.fxml.FXML
    private TableView<TrainingSession> tableView;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, Integer> trainingIdTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        tableView.getItems().clear();
        tableView.getItems().addAll(TrainingOperator.viewTrainingSession());


    }

    @javafx.fxml.FXML
    public void refreshActionOnButton(ActionEvent actionEvent) {
    }
}