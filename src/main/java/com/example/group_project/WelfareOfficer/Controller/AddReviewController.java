package com.example.group_project.WelfareOfficer.Controller;

import com.example.group_project.WelfareOfficer.Model.Review;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddReviewController
{

    @javafx.fxml.FXML
    private TextArea remarksTA;
    @javafx.fxml.FXML
    private TextField applicationIDTF;
    @javafx.fxml.FXML
    private Label addReviewLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> desicionCB;

    @javafx.fxml.FXML
    public void initialize() {
        desicionCB.getItems().setAll("Approve", "Reject");
    }

    @javafx.fxml.FXML
    public void SubmitReviewButtonOA(ActionEvent actionEvent) {
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