package com.example.group_project.WelfareOfficer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class ReviewSummaryController
{
    @javafx.fxml.FXML
    private TableColumn decisionTC;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private TableView TableViewTV;
    @javafx.fxml.FXML
    private TableColumn applicationIDTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private Label ReviewSummaryLabel;
    @javafx.fxml.FXML
    private DatePicker fromDP;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TableColumn remarksTC;
    @javafx.fxml.FXML
    private TableColumn reviewIDTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadSummaryButtonOA(ActionEvent actionEvent) {
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