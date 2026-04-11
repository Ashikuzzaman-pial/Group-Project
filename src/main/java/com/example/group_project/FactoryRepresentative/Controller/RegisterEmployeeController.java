package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.AppendableObjectOutputStream;
import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class RegisterEmployeeController {

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

        if (idText.isEmpty() || name.isEmpty() || contact.isEmpty() || designation.isEmpty() || factory == null) {
            registerEmployeeLabel.setText("All fields are required!");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        }
        catch (Exception e) {
            registerEmployeeLabel.setText("ID must be numeric!");
            return;
        }

        try {
            Long.parseLong(contact);
        }
        catch (Exception e) {
            registerEmployeeLabel.setText("Contact must be numeric");
            return;
        }

        File f = new File("Employee.bin");
        try {
            if (f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (true) {
                    try {
                        Employee e = (Employee) ois.readObject();

                        if (e.getId() == id) {
                            registerEmployeeLabel.setText("Employee ID already exists");
                            ois.close();
                            return;
                        }

                    } catch (EOFException ex) {
                        break;
                    }
                }

                ois.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Employee employee = new Employee(id, name, contact, designation, factory);
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(employee);
            oos.close();
            registerEmployeeLabel.setText("Employee Registered Successfully");

        }
        catch (Exception e) {
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