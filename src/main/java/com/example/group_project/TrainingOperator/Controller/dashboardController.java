package com.example.group_project.TrainingOperator.Controller;

import com.example.group_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class dashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void onNewTrainingSessionClick(javafx.event.ActionEvent event) {
        try {
            // 1. Use the absolute path starting with /
            // Ensure this matches your src/main/resources folder structure EXACTLY
            java.net.URL fxmlLocation = getClass().getResource("/com/example/group_project/TrainingOperator/AddNewTrainingSessionView.fxml");

            if (fxmlLocation == null) {
                System.err.println("CRITICAL: FXML file not found at the specified path!");
                return;
            }

            FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);

            // 2. Load the scene
            Scene scene = new Scene(fxmlLoader.load());

            // 3. Get the stage and switch
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Add New Training Session");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error loading FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onUpdateTrainingClick(javafx.event.ActionEvent event) {
        try {
            // 1. Use the absolute path starting with /
            // Ensure this matches your src/main/resources folder structure EXACTLY
            java.net.URL fxmlLocation = getClass().getResource("/com/example/group_project/TrainingOperator/UpdateTrainingView.fxml");

            if (fxmlLocation == null) {
                System.err.println("CRITICAL: FXML file not found at the specified path!");
                return;
            }

            FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);

            // 2. Load the scene
            Scene scene = new Scene(fxmlLoader.load());

            // 3. Get the stage and switch
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Add New Training Session");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Error loading FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}