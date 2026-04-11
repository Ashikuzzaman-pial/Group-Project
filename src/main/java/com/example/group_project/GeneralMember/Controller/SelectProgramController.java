package com.example.group_project.GeneralMember.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SelectProgramController
{
    @javafx.fxml.FXML
    private TextField AmountTF;
    @javafx.fxml.FXML
    private TextField DescriptionTA;
    @javafx.fxml.FXML
    private ComboBox<String> ProgramsCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        ProgramsCB.getItems().addAll("Medical Support", "Education Support", "Emergency Fund", "General Aid");
    }

    @javafx.fxml.FXML
    public void SubmitButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/group_project/GeneralMember/GeneralMemberDashboard.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}