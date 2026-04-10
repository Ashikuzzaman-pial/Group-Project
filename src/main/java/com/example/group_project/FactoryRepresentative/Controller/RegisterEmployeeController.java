package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;

public class RegisterEmployeeController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private Label registerEmployeeLabel;
    @javafx.fxml.FXML
    private ComboBox<String> factoryCB;
    @javafx.fxml.FXML
    private TextField contactTF;
    @javafx.fxml.FXML
    private TextField employeeIDTF;
    @javafx.fxml.FXML
    private TextField designationTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private static ArrayList<Employee> employeeList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        factoryCB.getItems().setAll("Factory A", "Factory B", "Factory C");
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        String idText = employeeIDTF.getText();
        String name = nameTF.getText();
        String contact = contactTF.getText();
        String designation = designationTF.getText();
        String factory = factoryCB.getValue();

        if (factory == null) {
            System.out.println("Select a factory");
            return;
        }

        int id = 0;
        try {
            id = Integer.parseInt(idText);
        }
        catch (Exception e) {
            System.out.println("Invalid ID");
            return;
        }
        Employee employee = new Employee(id, name, contact, designation, factory);
        employeeList.add(employee);

        System.out.println("Employee created:" + employee.getName());
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