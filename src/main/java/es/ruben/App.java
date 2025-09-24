package es.ruben;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase principal que carga la interfaz de usuario desde un archivo FXML.
 * La estructura y los estilos están definidos en color.fxml y styles.css.
 */

public class App extends Application {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    @Override
    public void start(Stage stage) throws Exception {

        logger.info("App lanzada");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/color.fxml"));

        Scene scene = new Scene(loader.load());
        stage.setTitle("Using Slider Controls");

        scene.getStylesheets().add(getClass().getResource("css/styles.css").toExternalForm());

        stage.setMinWidth(450);
        stage.setMinHeight(350);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}