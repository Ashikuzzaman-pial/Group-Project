package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Factory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class RegisterFactoryController
{
    @javafx.fxml.FXML
    private TextField factoryNameTF;
    @javafx.fxml.FXML
    private Label registerFactoryLabel;
    @javafx.fxml.FXML
    private TextField addressTF;
    @javafx.fxml.FXML
    private TextField contactNoTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    private static ArrayList<Factory> factoryList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {

        String factoryName = factoryNameTF.getText();
        String address = addressTF.getText();
        String contact = contactNoTF.getText();

        if (factoryName.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            System.out.println("Please fill all fields");
            return;
        }

        Factory factory = new Factory(factoryName, address, contact);
        factoryList.add(factory);

        System.out.println("Factory Registered:" + factoryName);
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