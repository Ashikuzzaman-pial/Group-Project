package com.example.group_project.TrainingOperator.Controller;
import com.example.group_project.TrainingOperator.Model.Registration;
import javafx.event.*;
import javafx.scene.control.*;

public class ViewRegisteredEmployeeListController
{
    @javafx.fxml.FXML
    private TableColumn <Registration,Integer> employeeIdTableColumn;
    @javafx.fxml.FXML
    private TableView<String> tableView;
    @javafx.fxml.FXML
    private TableColumn<Registration,Integer> regIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Registration,Integer> trainingIdTableColumn;
    @javafx.fxml.FXML
    private TextField registrationIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewActionOnButton(ActionEvent actionEvent) {
    }
}