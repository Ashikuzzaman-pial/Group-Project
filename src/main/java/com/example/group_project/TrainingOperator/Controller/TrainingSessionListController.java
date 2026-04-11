package com.example.group_project.TrainingOperator.Controller;

import com.example.group_project.TrainingOperator.Model.TrainingOperator;
import com.example.group_project.TrainingOperator.Model.TrainingSession;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainingSessionListController
{
    @javafx.fxml.FXML
    private TableView<TrainingSession> tableView;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, Integer> trainingIdTableColumn;
    private TrainingSession TrainingSession;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession,String>  timeTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, LocalDate> dateTableCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession,String> trainingNameTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        trainingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("trainingId"));
        trainingNameTableCol.setCellValueFactory(new PropertyValueFactory<>("trainingName"));
        trainingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        dateTableCol.setCellValueFactory(new PropertyValueFactory<>("date"));


    }
    @javafx.fxml.FXML
    public void refreshActionOnButton(ActionEvent actionEvent){
        tableView.getItems().clear();
        tableView.getItems().addAll(AddNewTrainingSessionController.trainingSessions);
    }






        }


