package com.example.group_project.TrainingOperator.Controller;
import com.example.group_project.TrainingOperator.Model.Registration;
import com.example.group_project.TrainingOperator.Model.TrainingOperator;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
        regIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("regId"));
        trainingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("trainingId"));
        employeeIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
    }


    @javafx.fxml.FXML
    public void viewActionOnButton(ActionEvent actionEvent) {
        //tableView.getItems().addAll(Fund.viewFundList());
           // tableView.getItems().clear();
           //tableView.getItems().addAll(Registration);
        //tableView.getItems().clear();
        //        tableView.getItems().addAll(TrainingSession);
        //    }

    }
}

