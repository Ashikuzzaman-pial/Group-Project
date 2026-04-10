package com.example.group_project.WelfareOfficer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class VerifyEmployeeController
{

    @javafx.fxml.FXML
    private Label verifyEmployeeLabel;
    @javafx.fxml.FXML
    private Label employeeIDLabel;
    @javafx.fxml.FXML
    private Label nameLabel;
    @javafx.fxml.FXML
    private Label programLabel;
    @javafx.fxml.FXML
    private ComboBox selectEmployeeCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label eligibilityStatusLabel;
    @javafx.fxml.FXML
    private Label programCriteriaLabel;
    @javafx.fxml.FXML
    private Label employeeNotEligibleLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/group_project/WelfareOfficer/WelfareOfficerDashboard.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}