package com.example.group_project.President.Controller;

import com.example.group_project.WelfareOfficer.Model.WelfareApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ApplicationFeedbackController
{
    @javafx.fxml.FXML
    private TableView<WelfareApplication> ApplicationFeedbackTV;
    @javafx.fxml.FXML
    private Label MessageLabel;
    @javafx.fxml.FXML
    private TextField SubjectTF;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> StatusTC;
    @javafx.fxml.FXML
    private Label SubjectLabel;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> DescriptionTC;
    @javafx.fxml.FXML
    private TextArea MessageTA;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, Integer> ApplicationIdTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> EmployeeNameTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> ApplicationTypeTC;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        ApplicationIdTC.setCellValueFactory(new PropertyValueFactory<>("applicationID"));
        EmployeeNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        ApplicationTypeTC.setCellValueFactory(new PropertyValueFactory<>("applicationType"));
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        DescriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    @javafx.fxml.FXML
    public void SendButtonOA(ActionEvent actionEvent) {

        ApplicationFeedbackTV.getItems().clear();

        File f = new File("Application.bin");

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    WelfareApplication app = (WelfareApplication) ois.readObject();
                    ApplicationFeedbackTV.getItems().add(app);
                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
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