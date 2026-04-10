package com.example.group_project.President.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class ApplicationFeedbackController
{
    @javafx.fxml.FXML
    private TableView ApplicationFeedbackTV;
    @javafx.fxml.FXML
    private Label MessageLabel;
    @javafx.fxml.FXML
    private TextField SubjectTF;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private Label SubjectLabel;
    @javafx.fxml.FXML
    private TableColumn DescriptionTC;
    @javafx.fxml.FXML
    private TextArea MessageTA;
    @javafx.fxml.FXML
    private TableColumn ApplicationIdTC;
    @javafx.fxml.FXML
    private TableColumn EmployeeNameTC;
    @javafx.fxml.FXML
    private TableColumn ApplicationTypeTC;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SendButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RequestButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/group_project/President/PresidentDashboard.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}