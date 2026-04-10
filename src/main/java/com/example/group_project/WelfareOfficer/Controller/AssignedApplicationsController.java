package com.example.group_project.WelfareOfficer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class AssignedApplicationsController
{
    @javafx.fxml.FXML
    private TableView tableViewTV;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn applicationIdTC;
    @javafx.fxml.FXML
    private Label assignedApplicationLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private TableColumn programTC;
    @javafx.fxml.FXML
    private TableColumn employeeNameTC;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private DatePicker fromDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewDetailsButtonOA(ActionEvent actionEvent) {

        

    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
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