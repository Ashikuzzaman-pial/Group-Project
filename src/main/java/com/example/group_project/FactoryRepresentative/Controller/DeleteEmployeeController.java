package com.example.group_project.FactoryRepresentative.Controller;

import com.example.group_project.FactoryRepresentative.Model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class DeleteEmployeeController
{
    @javafx.fxml.FXML
    private Label deleteEmployeeLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private ComboBox<String> selectEmployeeCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectEmployeeCB.getItems().setAll("Ladly", "Peal");
    }

    @javafx.fxml.FXML
    public void deleteButtonOA(ActionEvent actionEvent) {
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