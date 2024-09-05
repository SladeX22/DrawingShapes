package com.example.drawingshapes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DrawingShapesController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}