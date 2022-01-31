import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.print.DocFlavor;

public class mainForm extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("社区 | 主页");
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        GridPane gridPane = new GridPane();
        Label label = new Label("社区");
        label.setFont(Font.font(30));
        label.setStyle("-fx-text-fill: #FFFFFF; -fx-font-weight: bold");

        gridPane.addColumn(0, label);
        GridPane.setHgrow(label, Priority.ALWAYS);

        GridPane user = new GridPane();
        GridPane userMSG = new GridPane();
        user.setHgap(10);
        user.setVgap(10);
        user.setAlignment(Pos.TOP_LEFT);
        userMSG.setAlignment(Pos.TOP_LEFT);
        Label userName = new Label("晓梦DawnDream");
        Label userUUID = new Label("uuid:114514");
        userName.setFont(Font.font(20));
        userUUID.setFont(Font.font(15));
        userName.setStyle("-fx-text-fill: #FFFFFF; -fx-font-weight: bold");
        userUUID.setStyle("-fx-text-fill: #dadada; -fx-font-weight: bold");
        userMSG.add(userName , 0 , 0);
        userMSG.add(userUUID , 0 , 1);

        ImageView userHead = new ImageView();
        userHead.setImage(new Image(mainForm.class.getResource("img/head.jpg").toExternalForm()));
        userHead.setFitWidth(80);
        userHead.setFitHeight(80);

        Rectangle clip = new Rectangle(userHead.getFitWidth() , userHead.getFitHeight());
        clip.setArcHeight(20);
        clip.setArcWidth(20);
        userHead.setClip(clip);
        //user.setStyle("-fx-border-width: 5px; -fx-border-color: block; -fx-border-radius: 20px");

        user.add(userHead , 0 , 0);
        user.add(userMSG  , 1 , 0);
        gridPane.addColumn(3, user);
        VBox box = new VBox();
        box.getChildren().add(gridPane);
        box.setStyle("-fx-border-radius: 5px;");
        Scene scene = new Scene(box , 1500 , 900);
        scene.getStylesheets().add(Login.class.getResource("css/mainForm.css").toExternalForm());
        gridPane.setStyle("-fx-background-color: #FFC000; -fx-border-radius: 5px; -fx-border-color: #FFC000;-fx-border-width: 5px;");
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25 , 25 , 25 , 25));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
