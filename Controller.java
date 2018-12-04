package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;



public class Controller implements Initializable {
    @FXML
    private Button pane;

    AnchorPane homePane;

    
    @FXML
    private void switchToBody(MouseEvent event){
        //Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        //primaryStage.setScene(new Scene);

    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setNode(Node node)
    {
        pane.getChildrenUnmodifiable().clear();
        pane.getChildrenUnmodifiable().add((Node)node);
    }

    public void createPage(AnchorPane home, String loca) throws IOException
    {
        home = FXMLLoader.load(getClass().getResource(loca));
        setNode(home);
    }

    @FXML
    void Scene1Action(ActionEvent event) throws IOException {
this.createPage(homePane,"Scene1.fxml");
    }

    @FXML
    void Scene2Action(ActionEvent event) throws IOException {
        this.createPage(homePane,"Scene2.fxml");
    }

    @FXML
    void Scene3Action(ActionEvent event) throws IOException {
        this.createPage(homePane,"Scene13.fxml");
    }

    @FXML
    void Scene4Action(ActionEvent event) throws IOException {
        this.createPage(homePane,"Scene4.fxml");
    }




}

