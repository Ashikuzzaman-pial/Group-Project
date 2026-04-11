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
import java.time.LocalDate;

public class ViewApplicationsController
{
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> StatusTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, Integer> ApplicationIdTC;
    @javafx.fxml.FXML
    private TableView<WelfareApplication> ViewApplicationTV;
    @javafx.fxml.FXML
    private DatePicker SubmissionDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> StatusCB;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, LocalDate> SubmissionDateTC;
    @javafx.fxml.FXML
    private TextField ApplicationIdTF;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> EmployeeNameTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> ApplicationTypeTC;
    @javafx.fxml.FXML
    private TextField EmployeeNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> ApplicationTypeCB;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {


        ApplicationIdTC.setCellValueFactory(new PropertyValueFactory<>("applicationID"));
        ApplicationTypeTC.setCellValueFactory(new PropertyValueFactory<>("applicationType"));
        EmployeeNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        SubmissionDateTC.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));
    }

    @javafx.fxml.FXML
    public void ViewDetailsButtonOA(ActionEvent actionEvent) {

        ViewApplicationTV.getItems().clear();

        File f = new File("Application.bin");

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    WelfareApplication app = (WelfareApplication) ois.readObject();
                    ViewApplicationTV.getItems().add(app);
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