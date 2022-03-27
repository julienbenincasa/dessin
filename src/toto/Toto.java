package toto;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Toto extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        root.getChildren().add(TotoPane.createPane());
        stage.setTitle("Le titre en question");
        stage.setScene(new Scene(root, 400, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
