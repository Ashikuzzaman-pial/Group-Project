package com.example.group_project.GeneralMember.Controller;

import com.example.group_project.President.Model.WelfareProgram;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ViewProgramController
{
    @javafx.fxml.FXML
    private TableView<WelfareProgram> ViewProgramTV;
    @javafx.fxml.FXML
    private TableColumn<WelfareProgram, String> ProgramNameTC;
    @javafx.fxml.FXML
    private TableColumn<WelfareProgram, String> DescriptionTC;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        ProgramNameTC.setCellValueFactory(new PropertyValueFactory<>("programName"));
        DescriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    @javafx.fxml.FXML
    public void ShowButtonOA(ActionEvent actionEvent) {

        ViewProgramTV.getItems().clear();

        File f = new File("Program.bin");

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    WelfareProgram program = (WelfareProgram) ois.readObject();
                    ViewProgramTV.getItems().add(program);
                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();

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