package com.example.group_project.WelfareOfficer.Controller;

import com.example.group_project.WelfareOfficer.Model.Review;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class DeleteReviewController {

    @javafx.fxml.FXML
    private Label deleteReviewLabel;

    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    private ComboBox<Review> selectReviewCB;

    @javafx.fxml.FXML
    private Label errorLabel;

    private ArrayList<Review> reviewList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        loadReviews();
    }

    private void loadReviews() {

        File f = new File("Review.bin");

        if (!f.exists()){
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Review r = (Review) ois.readObject();
                    reviewList.add(r);
                    selectReviewCB.getItems().add(r);

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
    public void DeleteButtonOA(ActionEvent actionEvent) {

        Review selected = selectReviewCB.getValue();

        if (selected == null) {
            errorLabel.setText("Select a review first");
            return;
        }

        reviewList.remove(selected);
        selectReviewCB.getItems().remove(selected);

        try {
            FileOutputStream fos = new FileOutputStream("Review.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Review r : reviewList) {
                oos.writeObject(r);
            }

            oos.close();
            deleteReviewLabel.setText("Review Deleted Successfully");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group_project/WelfareOfficer/WelfareOfficerDashboard.fxml"));
            Node node = loader.load();
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}