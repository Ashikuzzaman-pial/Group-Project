package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.AppendableObjectOutputStream;
import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class WelfareIssueController {

    @javafx.fxml.FXML
    private TextArea issueTextArea;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> selectEmployeeCB;
    @javafx.fxml.FXML
    private Label submitWelfareIssueLabel;
    @javafx.fxml.FXML
    private Label errorLabel;

    private ArrayList<Employee> employeeList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        loadEmployees();
    }

    private void loadEmployees() {

        File f = new File("Employee.bin");
        if (!f.exists()){
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Employee e = (Employee) ois.readObject();
                    employeeList.add(e);
                    selectEmployeeCB.getItems().add(e.getName());

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
    public void submitButtonOA(ActionEvent actionEvent) {

        String employee = selectEmployeeCB.getValue();
        String issue = issueTextArea.getText();

        if (employee == null) {
            errorLabel.setText("Select an employee!");
            return;
        }

        if (issue == null || issue.isEmpty()) {
            errorLabel.setText("Issue cannot be empty!");
            return;
        }

        String record = employee + " - " + issue;

        File f = new File("Issue.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(record);
            oos.close();
            errorLabel.setText("Issue Submitted Successfully!");

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