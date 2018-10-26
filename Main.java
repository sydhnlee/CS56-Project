package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        FlowPane pane = new FlowPane();
        GridPane pane2 = new GridPane();
        Button button = new Button();
        Label name = new Label("Name:");
        name.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        Label age = new Label("Age:");
        Label weight = new Label("Weight:");
        Label height = new Label("Height:");
        Label sex = new Label("Sex:");
        Label activity = new Label("Activity:");
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField weightField = new TextField();
        TextField heightField = new TextField();
        TextField sexField = new TextField();
        TextField activityField = new TextField();
        Scene scene2 = new Scene(pane2, 300, 200);

        pane2.add(name, 0, 0, 1, 1);
        pane2.add(age, 0, 1, 1, 1);
        pane2.add(weight, 0, 2, 1, 1);
        pane2.add(height, 0, 3, 1, 1);
        pane2.add(sex, 0, 4, 1, 1);
        pane2.add(activity, 0, 5, 1, 1);
        pane2.add(nameField, 1, 0, 1, 1);
        pane2.add(ageField, 1, 1, 1, 1);
        pane2.add(weightField, 1, 2, 1, 1);
        pane2.add(heightField, 1, 3, 1, 1);
        pane2.add(sexField, 1, 4, 1, 1);
        pane2.add(activityField, 1, 5, 1, 1);
        pane2.setHgap(5);
        pane2.setVgap(15);
        pane2.setAlignment(Pos.CENTER);
        button.setText("Next");




        primaryStage.setTitle("User Info");
        primaryStage.setScene(scene2);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
