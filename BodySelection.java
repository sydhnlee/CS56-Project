package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class BodySelection extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ok.fxml"));
        GridPane pane = new GridPane();
        Image frank = new Image("https://i.imgur.com/TvgAqv4.jpg");
        Image hungFrank = new Image("https://i.imgur.com/2EE3KQZ.jpg");
        ImageView hello = new ImageView(frank);
        hello.fitHeightProperty().bind(primaryStage.heightProperty());
        hello.fitWidthProperty().bind(primaryStage.widthProperty());

        hello.setOnMousePressed(new EventHandler<MouseEvent>()
        {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("Click");
               // hello.setImage(hungFrank);

            }
        });

        hello.setOnMouseReleased(new EventHandler<MouseEvent>()
        {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("Clack");
               // hello.setImage(frank);
            }
        });
        pane.getChildren().add(hello);

        Scene scene = new Scene(root);


        primaryStage.setTitle("Body Select");
        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(600);
        primaryStage.show();
    }
}
