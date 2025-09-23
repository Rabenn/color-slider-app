package es.ruben;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Ahora el FXML está en resources/fxml/
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/color.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Using Slider Controls");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}