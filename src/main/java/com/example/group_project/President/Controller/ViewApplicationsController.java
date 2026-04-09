package com.example.group_project.President.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class ViewApplicationsController
{
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private TableColumn ApplicationIdTC;
    @javafx.fxml.FXML
    private TableView ViewApplicationTV;
    @javafx.fxml.FXML
    private DatePicker SubmissionDateDP;
    @javafx.fxml.FXML
    private ComboBox StatusCB;
    @javafx.fxml.FXML
    private TableColumn SubmissionDateTC;
    @javafx.fxml.FXML
    private TextField ApplicationIdTF;
    @javafx.fxml.FXML
    private TableColumn EmployeeNameTC;
    @javafx.fxml.FXML
    private TableColumn ApplicationTypeTC;
    @javafx.fxml.FXML
    private TextField EmployeeNameTF;
    @javafx.fxml.FXML
    private ComboBox ApplicationTypeCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewDetailsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PresidentDashBoard.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}