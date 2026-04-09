package com.example.group_project.FinanceOfficer.Controller;
import com.example.group_project.FinanceOfficer.Model.FinanceOfficer;
import com.example.group_project.FinanceOfficer.Model.Payment;
import javafx.event.*;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ViewPaymentrecordsController
{
    @javafx.fxml.FXML
    private TableColumn <Payment, LocalDate> dateTableView;
    @javafx.fxml.FXML
    private TextField paymenytIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Payment,LocalDate> applicationIdTableView;
    @javafx.fxml.FXML
    private TableColumn<Payment,Integer> amountIdTableView;
    @javafx.fxml.FXML
    private TableView<String> tableView;
    @javafx.fxml.FXML
    private TableColumn<Payment,Integer> paymentIdTableView;

    @javafx.fxml.FXML
    public void initialize() {
        tableView.getItems().clear();

    }


    @javafx.fxml.FXML
    public void viewOnActionButton(ActionEvent actionEvent) {
    }
}