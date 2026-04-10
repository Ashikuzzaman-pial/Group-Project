package com.example.group_project;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> userCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {

        userCB.getItems().setAll("President","General Member","Welfare Officer","Factory Representative");
    }

    @javafx.fxml.FXML
    public void LoginButtonOA(ActionEvent actionEvent) {

        String selectedUser = userCB.getValue();
        if (selectedUser == null) {
            messageLabel.setText("Please select a user!");
        }
        try{
            if (selectedUser.equals("President")) {
                FXMLLoader.load(getClass().getResource("/com/example/group_project/President/PresidentDashboard.fxml"));
            } else if (selectedUser.equals("General Member")) {
                FXMLLoader.load(getClass().getResource("/com/example/group_project/GeneralMember/GeneralMemberDashboard.fxml"));
            } else if (selectedUser.equals("Welfare Officer")) {
                FXMLLoader.load(getClass().getResource("/com/example/group_project/WelfareOfficer/WelfareOfficerDashboard.fxml"));
            } else if (selectedUser.equals("Factory Representative")) {
                FXMLLoader.load(getClass().getResource("/com/example/group_project/FactoryRepresentative/FactoryRepresentativeDashboard.fxml"));
            }

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/group_project/LoginView.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}