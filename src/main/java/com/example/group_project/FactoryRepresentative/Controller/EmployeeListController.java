package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class EmployeeListController {

    @javafx.fxml.FXML
    private TableView<Employee> tableViewTV;
    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> idTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> nameTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> contactTC;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> designationTC;
    @javafx.fxml.FXML
    private ComboBox<String> selectFactoryCB;
    @javafx.fxml.FXML
    private Label noemployeesfoundLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        selectFactoryCB.getItems().setAll("Factory A", "Factory B", "Factory C");

        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactTC.setCellValueFactory(new PropertyValueFactory<>("contact"));
        designationTC.setCellValueFactory(new PropertyValueFactory<>("designation"));
    }

    @javafx.fxml.FXML
    public void showButtonOA(ActionEvent actionEvent) {

        tableViewTV.getItems().clear();
        String factory = selectFactoryCB.getValue();

        if (factory == null) {
            noemployeesfoundLabel.setText("Select a factory");
            return;
        }

        File f = new File("Employee.bin");
        boolean found = false;

        try {
            if (!f.exists()) {
                noemployeesfoundLabel.setText("No employees found");
                return;
            }

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Employee e = (Employee) ois.readObject();

                    if (e.getFactory().equals(factory)) {
                        tableViewTV.getItems().add(e);
                        found = true;
                    }
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

        if (!found) {
            noemployeesfoundLabel.setText("No employees found for selected factory");
        } else {
            noemployeesfoundLabel.setText("");
        }
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group_project/FactoryRepresentative/FactoryRepresentativeDashboard.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}