package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class UpdateEmployeeController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox<String> factoryCB;
    @javafx.fxml.FXML
    private Label updateEmployeeLabel;
    @javafx.fxml.FXML
    private TextField contactTF;
    @javafx.fxml.FXML
    private TextField designationTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private Label employeeIdDisplayLabel;
    @javafx.fxml.FXML
    private ComboBox<Employee> selectEmployee;

    @javafx.fxml.FXML
    public void initialize() {

        factoryCB.getItems().setAll("Factory A", "Factory B", "Factory C");
    }

    @Deprecated
    public void editButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOA(ActionEvent actionEvent) {
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