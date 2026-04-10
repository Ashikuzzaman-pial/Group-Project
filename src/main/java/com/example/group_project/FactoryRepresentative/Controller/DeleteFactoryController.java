package com.example.group_project.FactoryRepresentative.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class DeleteFactoryController
{
    @javafx.fxml.FXML
    private Label deleteFactoryLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> selectFactoryCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectFactoryCB.getItems().setAll("Factory A", "Factory B", "Factory C");
    }

    @javafx.fxml.FXML
    public void deleteButtonOA(ActionEvent actionEvent) {
        String selected = selectFactoryCB.getValue();

        if (selected != null) {
            selectFactoryCB.getItems().remove(selected);
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