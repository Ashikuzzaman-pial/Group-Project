package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Factory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class UpdateFactoryController
{
    @javafx.fxml.FXML
    private TableColumn<Factory, String> factoryNameTC;
    @javafx.fxml.FXML
    private TableColumn<Factory, Integer> contactTC;
    @javafx.fxml.FXML
    private TableColumn<Factory, String> addressTC;
    @javafx.fxml.FXML
    private TextField factoryNameTF;
    @javafx.fxml.FXML
    private TableView<Factory> tableViewTV;
    @javafx.fxml.FXML
    private TextField addressTF;
    @javafx.fxml.FXML
    private Label updateFactoryProfileLabel;
    @javafx.fxml.FXML
    private TextField contactTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        factoryNameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressTC.setCellValueFactory(new PropertyValueFactory<>("address"));
        contactTC.setCellValueFactory(new PropertyValueFactory<>("contact"));
    }

    @javafx.fxml.FXML
    public void editSelectedButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/group_project/FactoryRepresentative/FactoryRepresentativeDashboard.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}