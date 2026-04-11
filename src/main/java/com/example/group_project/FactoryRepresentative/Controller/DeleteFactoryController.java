package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Factory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class DeleteFactoryController {

    @javafx.fxml.FXML
    private Label deleteFactoryLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> selectFactoryCB;

    private ArrayList<Factory> factoryList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        loadFactories();

        selectFactoryCB.getItems().clear();

        for (Factory f : factoryList) {
            selectFactoryCB.getItems().add(f.getName());
        }
    }

    private void loadFactories() {

        File f = new File("Factory.bin");
        FileInputStream fis;
        ObjectInputStream ois;

        if (!f.exists()) {
            return;
        }

        try {

            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            while (true) {

                try {
                    Factory factory = (Factory) ois.readObject();
                    factoryList.add(factory);
                }
                catch (EOFException e) {
                    break;
                }
            }

            ois.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void deleteButtonOA(ActionEvent actionEvent) {

        String selected = selectFactoryCB.getValue();

        if (selected == null) {
            deleteFactoryLabel.setText("Please select a factory!");
            return;
        }

        for (int i = 0; i < factoryList.size(); i++) {

            if (factoryList.get(i).getName().equals(selected)) {
                factoryList.remove(i);
                break;
            }
        }

        FileOutputStream fos;
        ObjectOutputStream oos;

        try {

            fos = new FileOutputStream("Factory.bin");
            oos = new ObjectOutputStream(fos);

            for (Factory f : factoryList) {
                oos.writeObject(f);
            }

            oos.close();

            deleteFactoryLabel.setText("Factory Deleted Successfully!");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(
                    getClass().getResource("/com/example/group_project/FactoryRepresentative/FactoryRepresentativeDashboard.fxml")
            );

            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}