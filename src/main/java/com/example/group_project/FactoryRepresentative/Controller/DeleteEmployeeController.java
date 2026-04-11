package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class DeleteEmployeeController {

    @javafx.fxml.FXML
    private Label deleteEmployeeLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectEmployeeCB;

    private ArrayList<Employee> employeeList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        loadEmployees();
        selectEmployeeCB.getItems().clear();

        for (Employee e : employeeList) {
            selectEmployeeCB.getItems().add(e.getId());
        }
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void deleteButtonOA(ActionEvent actionEvent) {

        Integer selectedId = selectEmployeeCB.getValue();

        if (selectedId == null) {
            deleteEmployeeLabel.setText("Please select an employee ID!");
            return;
        }

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == selectedId) {
                employeeList.remove(i);
                break;
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("Employee.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Employee e : employeeList) {
                oos.writeObject(e);
            }

            oos.close();
            deleteEmployeeLabel.setText("Employee deleted successfully");

        }
        catch (Exception e) {
            e.printStackTrace();
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