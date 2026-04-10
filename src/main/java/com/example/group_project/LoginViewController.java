package com.example.group_project;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
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
            return;
        }
        try{
            if (selectedUser.equals("President")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group_project/President/PresidentDashboard.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
            } else if (selectedUser.equals("General Member")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group_project/GeneralMember/GeneralMemberDashboard.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
            } else if (selectedUser.equals("Welfare Officer")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group_project/WelfareOfficer/WelfareOfficerDashboard.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
            } else if (selectedUser.equals("Factory Representative")) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group_project/FactoryRepresentative/FactoryRepresentativeDashboard.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}