package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.AppendableObjectOutputStream;
import com.example.group_project.FactoryRepresentative.Model.Factory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class RegisterFactoryController {

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

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {

        String name = factoryNameTF.getText();
        String address = addressTF.getText();
        String contact = contactNoTF.getText();

        if (name.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            registerFactoryLabel.setText("Please fill all fields");
            return;
        }

        Factory factory = new Factory(name, address, contact);

        File f = new File("Factory.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(factory);
            oos.close();
            registerFactoryLabel.setText("Factory Registered Successfully");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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