package com.example.group_project.WelfareOfficer.Controller;

import com.example.group_project.WelfareOfficer.Model.WelfareApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AssignedApplicationsController
{
    @javafx.fxml.FXML
    private TableView<WelfareApplication> tableViewTV;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, Integer> applicationIdTC;
    @javafx.fxml.FXML
    private Label assignedApplicationLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private DatePicker toDP;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> programTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> employeeNameTC;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, LocalDate> dateTC;
    @javafx.fxml.FXML
    private DatePicker fromDP;

    private ArrayList<WelfareApplication> applicationList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        statusCB.getItems().addAll("Pending", "Reviewed", "Rejected");

        applicationIdTC.setCellValueFactory(new PropertyValueFactory<>("applicationID"));
        employeeNameTC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        programTC.setCellValueFactory(new PropertyValueFactory<>("applicationType"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));

        loadApplications();
    }

    private void loadApplications() {

        File f = new File("Application.bin");

        if (!f.exists()){
            return;
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));

            while (true) {
                try {
                    WelfareApplication wa = (WelfareApplication) ois.readObject();
                    applicationList.add(wa);
                }
                catch (EOFException e) {
                    break;
                }
            }
            ois.close();
            tableViewTV.getItems().addAll(applicationList);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void filterButtonOA(ActionEvent actionEvent) {
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