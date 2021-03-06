package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Optional;

import static java.lang.String.valueOf;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        BorderPane bp = new BorderPane();
        GridPane gp = new GridPane();
        FlowPane fp = new FlowPane();
        fp.setPrefSize(50, 40);
        HBox hb = new HBox();
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();

       // fp.setStyle("-fx-background-color: cadetblue;");
        fp.setPadding(new Insets(20,20,20,20));
        Button button = new Button();
        button.setText("Next");

        Text greet = new Text("Welcome, please enter your information please");
        greet.setStyle("-fx-font-size: 17");
        fp.getChildren().addAll(greet);
        fp.setAlignment(Pos.CENTER);

        Alert alert = new Alert(Alert.AlertType.ERROR, "fillem in you little shit");
        alert.setHeaderText(null);
        alert.setGraphic(null);

        Label name = new Label("First name:");
        Label age = new Label("Age:");
        Label weight = new Label("Weight:");
        Label weight2 = new Label("lb");
        Label height = new Label("Height:");
        Label height2 = new Label("ft");
        Label height3 = new Label("in");
        Label sex = new Label("Sex:");
        Label activity = new Label("Activity:");

        name.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        age.setStyle("-fx-font-size: 15");
        weight.setStyle("-fx-font-size: 15");
        weight2.setStyle("-fx-font-size: 14");
        height.setStyle("-fx-font-size: 15");
        height2.setStyle("-fx-font-size: 14");
        height3.setStyle("-fx-font-size: 14");
        sex.setStyle("-fx-font-size: 15");
        activity.setStyle("-fx-font-size: 15");

        ChoiceBox genderChoice = new ChoiceBox();
        ChoiceBox activityChoice = new ChoiceBox();
        ChoiceBox heightChoice = new ChoiceBox();
        ChoiceBox heightChoice2 = new ChoiceBox();

        heightChoice.getItems().addAll("3","4","5","6","7");
        heightChoice2.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10","11");
        genderChoice.getItems().addAll("Male", "Female");
        activityChoice.getItems().addAll("Sedentary","Moderately Active", "Very Active");

        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField weightField = new TextField();
        TextField sexField = new TextField();
        TextField activityField = new TextField();

        weightField.setMaxWidth(40);
        weightField.setAlignment(Pos.CENTER);
        ageField.setMaxWidth(40);
        ageField.setAlignment(Pos.CENTER);

        hb.getChildren().addAll(button);
        hb.setAlignment(Pos.CENTER_RIGHT);
        hb.setPadding(new Insets(0, 5, 5, 0));
        hb2.getChildren().addAll(heightChoice, height2, heightChoice2, height3);
        hb2.setSpacing(5);
        hb2.setMargin(height2, new Insets(0,10,0,0));
        hb3.getChildren().addAll(weightField, weight2);
        hb3.setSpacing(5);

        gp.add(name, 0, 0, 1, 1);
        gp.add(age, 0, 1, 1, 1);
        gp.add(weight, 0, 2, 1, 1);
        gp.add(height, 0, 3, 1, 1);
        gp.add(sex, 0, 4, 1, 1);
        gp.add(activity, 0, 5, 1, 1);
        gp.add(nameField, 1, 0, 1, 1);
        gp.add(ageField, 1, 1, 1, 1);
        gp.add(hb3, 1, 2, 1, 1);
        gp.add(hb2, 1, 3, 1, 1);
        gp.add(genderChoice, 1, 4, 1, 1);
        gp.add(activityChoice, 1, 5, 1, 1);

        gp.setHgap(5);
        gp.setVgap(15);
        gp.setAlignment(Pos.CENTER);

        bp.setTop(fp);
        bp.setCenter(gp);
        bp.setBottom(hb);


        Scene scene2 = new Scene(bp);
        primaryStage.setTitle("User Info");
        primaryStage.setScene(scene2);
        primaryStage.setResizable(false);
        primaryStage.setHeight(420);
        primaryStage.setWidth(450);
        primaryStage.show();

        button.setOnAction(new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event)
            {
                try
                {
                    double height = Double.parseDouble(valueOf(heightChoice.getValue()));
                    double height2 = Double.parseDouble(valueOf(heightChoice2.getValue()));
                    double totalHeight = height + height2/12;

                    String username = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());
                    int weight = Integer.parseInt(weightField.getText());
                    String activity = valueOf(activityChoice.getValue());
                    char gender = valueOf(genderChoice.getValue()).charAt(0);

                    User user = new User(username, age, weight, totalHeight, activity, gender);
                    System.out.println(user);
                }

                catch (Exception ex)
                {
                    Optional<ButtonType> result = alert.showAndWait();
                }
            }
        });
        
        /*
        
        Dashboard main stage
        
            @Override
    public void start(Stage primaryStage) throws Exception {
       try{ Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene sceneD = new Scene(root, 917, 518);
        primaryStage.setScene(sceneD);
        primaryStage.show();
    }catch(Exception e)
    {
        e.printStackTrace();}

    }
        
        
        */
        
        
        
    }


    public static void main(String[] args) {
        //launch(args);
    }
}
