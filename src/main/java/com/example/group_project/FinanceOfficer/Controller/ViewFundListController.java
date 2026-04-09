package com.example.group_project.FinanceOfficer.Controller;
import com.example.group_project.FinanceOfficer.Model.Fund;
import com.example.group_project.FinanceOfficer.Model.FinanceOfficer;
import javafx.event.*;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ViewFundListController
{
    @javafx.fxml.FXML
    private TableColumn<Fund,Integer> amountTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Fund,Integer> fundIdColumn;
    @javafx.fxml.FXML
    private TableView<String> tableView;
    @javafx.fxml.FXML
    private TableColumn<Fund, LocalDate> dateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        tableView.getItems().clear();
        //tableView.getItems().addAll(FinanceOfficer.viewFundList());
    }

    @javafx.fxml.FXML
    public void refreshOnActionButton(ActionEvent actionEvent) {
    }
}