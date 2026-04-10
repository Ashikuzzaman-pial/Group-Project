package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class EmployeeListController
{
    @javafx.fxml.FXML
    private TableColumn<Employee, String> contactTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> nameTC;
    @javafx.fxml.FXML
    private TableView<Employee> tableViewTV;
    @javafx.fxml.FXML
    private ComboBox<String> selectFactoryCB;
    @javafx.fxml.FXML
    private Label employeeListLabel;
    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> idTC;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label noemployeesfoundLabel;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> designationTC;


    @javafx.fxml.FXML
    public void initialize() {
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactTC.setCellValueFactory(new PropertyValueFactory<>("contact"));
        designationTC.setCellValueFactory(new PropertyValueFactory<>("designation"));

        tableViewTV.getItems().addAll(
                new Employee(1, "Ladly", "01711111111", "Manager", "Factory 1"),
                new Employee(2, "Peal", "01822222222", "Worker", "Factory 2")
        );

    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/group_project/FactoryRepresentative/FactoryRepresentativeDashboard.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}