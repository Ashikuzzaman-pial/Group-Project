package com.example.group_project.WelfareOfficer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class UpdateApplicationStatusController
{
    @javafx.fxml.FXML
    private TableView tableViewTV;
    @javafx.fxml.FXML
    private TableColumn employeeNameTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn applicationIDTC;
    @javafx.fxml.FXML
    private Label updateApplicationStatusLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TableColumn programTC;
    @javafx.fxml.FXML
    private ComboBox StatusCB;
    @javafx.fxml.FXML
    private TableColumn submissionDateTC;
    @javafx.fxml.FXML
    private Label selectApplicationLabel;
    @javafx.fxml.FXML
    private Label selectNewStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOA(ActionEvent actionEvent) {
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