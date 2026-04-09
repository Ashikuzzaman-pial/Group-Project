package com.example.group_project.President.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class PresidentDashBoardController
{
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewReportButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewApplicationButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewApplications.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void applicationFeedbackButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateProgramButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteProgramButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectApplicationButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveApplicationButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOutButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addProgramButtonOA(ActionEvent actionEvent) {
    }
}