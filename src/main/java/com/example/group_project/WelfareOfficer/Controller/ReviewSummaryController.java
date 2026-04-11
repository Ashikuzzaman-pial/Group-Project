package com.example.group_project.WelfareOfficer.Controller;

import com.example.group_project.WelfareOfficer.Model.Review;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class ReviewSummaryController
{
    @javafx.fxml.FXML
    private TableColumn<Review, String> decisionTC;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private TableView<Review> TableViewTV;
    @javafx.fxml.FXML
    private TableColumn<Review, Integer> applicationIDTC;
    @javafx.fxml.FXML
    private TableColumn<Review,LocalDate> dateTC;
    @javafx.fxml.FXML
    private Label ReviewSummaryLabel;
    @javafx.fxml.FXML
    private DatePicker fromDP;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private TableColumn<Review, String> remarksTC;
    @javafx.fxml.FXML
    private TableColumn<Review, Integer> reviewIDTC;

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