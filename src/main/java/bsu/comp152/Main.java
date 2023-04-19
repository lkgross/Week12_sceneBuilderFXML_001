package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Store the location of the user interface (UI) resource.
        var loc = getClass().getResource("Main.fxml");
        // Parent is a superclass of Stage.
        Parent root = FXMLLoader.load(loc);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("A GUI designed in SceneBuilder");
        primaryStage.show();
    }
}