package com.example.group_project.FinanceOfficer.Controller;
import com.example.group_project.FinanceOfficer.Model.FinansialSummary;
import javafx.scene.control.*;

public class ViewFundRecordsInTableController
{
    @javafx.fxml.FXML
    private TableView<String> tableView;
    @javafx.fxml.FXML
    private TableColumn <FinansialSummary,Integer> balanceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<FinansialSummary,Integer> totalFundTAbleColumn;
    @javafx.fxml.FXML
    private TableColumn <FinansialSummary,Integer>totalContributionTableColumn;
    @javafx.fxml.FXML
    private TableColumn<FinansialSummary,Integer> totalPaymentTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }}