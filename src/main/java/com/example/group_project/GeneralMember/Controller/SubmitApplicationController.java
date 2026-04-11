package com.example.group_project.GeneralMember.Controller;

import com.example.group_project.AppendableObjectOutputStream;
import com.example.group_project.WelfareOfficer.Model.WelfareApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SubmitApplicationController
{
    @javafx.fxml.FXML
    private Label StatusLabel;
    @javafx.fxml.FXML
    private TextArea DescriptionTA;
    @javafx.fxml.FXML
    private TextField RequestedAmountTF;
    @javafx.fxml.FXML
    private ComboBox<String> ApplicationTypeCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        ApplicationTypeCB.getItems().addAll("Medical", "Education", "Emergency", "Other");
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