package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class EmployeeListController {

    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> idTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> nameTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> contactTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> designationTC;
    @javafx.fxml.FXML
    private TableView<Employee> tableViewTV;
    @javafx.fxml.FXML
    private ComboBox<String> selectFactoryCB;
    @javafx.fxml.FXML
    private Label employeeListLabel;
    @javafx.fxml.FXML
    private Label noemployeesfoundLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private ArrayList<Employee> employeeList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactTC.setCellValueFactory(new PropertyValueFactory<>("contact"));
        designationTC.setCellValueFactory(new PropertyValueFactory<>("designation"));

        selectFactoryCB.getItems().addAll("Factory 1", "Factory 2", "Factory 3");

        loadEmployees();
    }

    private void loadEmployees() {

        File f = new File("Employee.bin");
        FileInputStream fis;
        ObjectInputStream ois;

        if (!f.exists()) {
            return;
        }

        try {

            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Employee e = (Employee) ois.readObject();
                    employeeList.add(e);
                }
                catch (EOFException ex) {
                    break;
                }
            }
            ois.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void showButtonOA(ActionEvent actionEvent) {

        tableViewTV.getItems().clear();
        noemployeesfoundLabel.setText("");

        String selectedFactory = selectFactoryCB.getValue();

        if (selectedFactory == null) {
            employeeListLabel.setText("Please select a factory");
            return;
        }

        for (Employee e : employeeList) {
            if (e.getFactory().equals(selectedFactory)) {
                tableViewTV.getItems().add(e);
            }
        }

        if (tableViewTV.getItems().isEmpty()) {
            noemployeesfoundLabel.setText("No employees found for selected factory!");
        }
        else {
            noemployeesfoundLabel.setText("");
        }
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