package com.example.group_project.FactoryRepresentative.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class WelfareIssueController
{
    @javafx.fxml.FXML
    private TextArea issueTextArea;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String > selectEmployeeCB;
    @javafx.fxml.FXML
    private Label submitWelfareIssueLabel;
    @javafx.fxml.FXML
    private Label errorLabel;

    private static ArrayList<String> issueList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectEmployeeCB.getItems().setAll("Ladly", "Peal");
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        
        String employee = (String) selectEmployeeCB.getValue();
        String issue = issueTextArea.getText();

        if (employee == null || issue.isEmpty()) {
            errorLabel.setText("Please select an employee and write issue");
            return;
        }

        String record = employee + " - " + issue;
        issueList.add(record);

        System.out.println("Issue Submitted: " + record);
        errorLabel.setText("Issue Submitted Successfully");
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