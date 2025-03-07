package cr.ac.una.proyecto;

import cr.ac.una.proyecto.util.FlowController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().InitializeFlow(stage, null);
        FlowController.getInstance().goViewInWindow("pruebaView");
    }

    public static void main(String[] args) {
        launch();
    }

}