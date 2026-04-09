package com.example.group_project.President.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class UpdateProgramController
{
    @javafx.fxml.FXML
    private TextField BudgetTF;
    @javafx.fxml.FXML
    private TableView UpdateProgramTV;
    @javafx.fxml.FXML
    private TableColumn BudgetTC;
    @javafx.fxml.FXML
    private TableColumn ProgramNameTC;
    @javafx.fxml.FXML
    private TextField ProgramNameTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PresidentDashBoard.fxml"));
            Node node = fxmlLoader.load();
            mainPane.getChildren().setAll(node);
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}