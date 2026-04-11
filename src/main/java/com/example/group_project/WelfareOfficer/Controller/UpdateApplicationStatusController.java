package com.example.group_project.WelfareOfficer.Controller;

import com.example.group_project.WelfareOfficer.Model.WelfareApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class UpdateApplicationStatusController
{
    @javafx.fxml.FXML
    private TableView<WelfareApplication> tableViewTV;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> employeeNameTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, Integer> applicationIDTC;
    @javafx.fxml.FXML
    private Label updateApplicationStatusLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> programTC;
    @javafx.fxml.FXML
    private ComboBox<String> StatusCB;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, LocalDate> submissionDateTC;
    @javafx.fxml.FXML
    private Label selectApplicationLabel;
    @javafx.fxml.FXML
    private Label selectNewStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {

        StatusCB.getItems().addAll("Pending", "Approved", "Rejected");

        employeeNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        applicationIDTC.setCellValueFactory(new PropertyValueFactory<>("applicationID"));
        programTC.setCellValueFactory(new PropertyValueFactory<>("applicationType"));
        submissionDateTC.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));
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