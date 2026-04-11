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
    private ComboBox<String> selectEmployeeCB;
    @javafx.fxml.FXML
    private Label deleteEmployeeLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private ArrayList<Employee> employeeList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        loadEmployees();
    }

    private void loadEmployees() {

        File f = new File("Employee.bin");
        if (!f.exists()) return;

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Employee e = (Employee) ois.readObject();
                    employeeList.add(e);
                    selectEmployeeCB.getItems().add(e.getName());

                } catch (EOFException ex) {
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

        String selected = selectEmployeeCB.getValue();

        if (selected == null) return;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(selected)) {
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

            deleteEmployeeLabel.setText("Employee Deleted");

        } catch (Exception e) {
            e.printStackTrace();
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