package com.example.group_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application Group Project -oboni ! ok");
        System.out.println("Github Update!");
        System.out.println("great");
    }
}
