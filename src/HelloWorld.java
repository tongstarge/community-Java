import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class HelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        button.setText("say Hello World");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root , 400 , 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("awa");
        primaryStage.show();
    }
}
