package com.example.group_project.GeneralMember.Controller;

import com.example.group_project.WelfareOfficer.Model.WelfareApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CancelApplicationController
{
    @javafx.fxml.FXML
    private TableView<WelfareApplication> CancelApplicationTV;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> StatusTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, Integer> ApplicationIdTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareApplication, String> ApplicationTypeTC;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        ApplicationIdTC.setCellValueFactory(new PropertyValueFactory<>("applicationID"));
        ApplicationTypeTC.setCellValueFactory(new PropertyValueFactory<>("applicationType"));
        StatusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void CancelButtonOA(ActionEvent actionEvent) {

        WelfareApplication selectedApp = CancelApplicationTV.getSelectionModel().getSelectedItem();

        if (selectedApp == null) {
            System.out.println("Select an application first!");
            return;
        }

        CancelApplicationTV.getItems().remove(selectedApp);

        try {
            FileOutputStream fos = new FileOutputStream("Application.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (WelfareApplication app : CancelApplicationTV.getItems()) {
                oos.writeObject(app);
            }

            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
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