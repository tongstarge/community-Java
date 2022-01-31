import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login for TongStarGe");
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25 , 25 , 25 , 25));
        Scene scene = new Scene(gridPane , 300 , 185);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Login.class.getResource("css/Login.css").toExternalForm());

        Text title = new Text("Welcome");
        title.setId("title");
        //title.setFont(Font.font("Tahoma" , FontWeight.NORMAL , 21));
        gridPane.add(title , 0 , 0 , 2 , 1);

        Label userNameLabel = new Label("UserName:");
        gridPane.add(userNameLabel , 0 , 1);
        TextField userNameField = new TextField();
        gridPane.add(userNameField , 1, 1);

        Label passwordLabel = new Label("  Password:");
        gridPane.add(passwordLabel , 0 , 2);
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField , 1 , 2);

        Button Sign = new Button("Sing in");
        HBox hb = new HBox(10);
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.getChildren().add(Sign);
        gridPane.add(hb , 1 , 4);
        final Text text = new Text();
        //gridPane.add(text , 1 , 6);

        Sign.setOnAction(event -> {
            System.out.println("");
            String userName = userNameField.getText();
            String password = passwordField.getText();
            if (!userName.isEmpty() && !password.isEmpty()) {
                System.out.println(userName + "  " + password);
                primaryStage.close();
                try {
                    new mainForm().start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        primaryStage.show();
    }
}
