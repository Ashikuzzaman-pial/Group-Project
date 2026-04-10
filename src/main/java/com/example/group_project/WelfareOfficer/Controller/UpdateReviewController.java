package com.example.group_project.WelfareOfficer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class UpdateReviewController
{
    @javafx.fxml.FXML
    private ComboBox<String> decisionCB;
    @javafx.fxml.FXML
    private TextArea remarksTA;
    @javafx.fxml.FXML
    private Label updateReviewLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> selectReviewCB;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
        decisionCB.getItems().addAll("Approved", "Rejected", "Pending");

    }

    @javafx.fxml.FXML
    public void UpdateButtonOA(ActionEvent actionEvent) {
        if(decisionCB.getValue() == null) {
            System.out.println("Decision cannot be empty");
            return;
        }

        String review = selectReviewCB.getValue();
        String decision = decisionCB.getValue();
        String remarks = remarksTA.getText();

        System.out.println("Review: " + review);
        System.out.println("Decision: " + decision);
        System.out.println("Remarks: " + remarks);
    }

    @javafx.fxml.FXML
    public void LoadButtonOA(ActionEvent actionEvent) {

        selectReviewCB.getItems().clear();

        selectReviewCB.getItems().addAll(
                "Review 1",
                "Review 2",
                "Review 3"
        );
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