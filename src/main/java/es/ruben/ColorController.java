package es.ruben;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorController {

    @FXML
    private Rectangle colorRect;

    @FXML
    private Slider sliderRed;

    @FXML
    private Slider sliderGreen;

    @FXML
    private Slider sliderBlue;

    @FXML
    private void initialize() {
        updateColor();

        sliderRed.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
        sliderGreen.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
        sliderBlue.valueProperty().addListener((obs, oldVal, newVal) -> updateColor());
    }

    private void updateColor() {
        int r = (int) sliderRed.getValue();
        int g = (int) sliderGreen.getValue();
        int b = (int) sliderBlue.getValue();
        colorRect.setFill(Color.rgb(r, g, b));
    }
}