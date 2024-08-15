package battlewars.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Label with the welcome message
        Label welcomeLabel = new Label("Hello, Welcome to Intergalactic Battle Wars!");

        // Create a layout and add the Label to it
        BorderPane root = new BorderPane();
        root.setCenter(welcomeLabel);

        // Create a Scene with the layout
        Scene scene = new Scene(root, 800, 600);

        // Set up the Stage
        primaryStage.setTitle("Intergalactic Battle Wars");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}