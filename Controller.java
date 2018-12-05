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
    public void scene1Action(javafx.event.ActionEvent actionEvent) throws IOException {
        this.createPage(homePane,"scene1.fxml");
    }

    @FXML
    public void scene2Action(javafx.event.ActionEvent actionEvent) throws IOException {
        this.createPage(homePane,"scene2.fxml");
    }

    @FXML
    public void scene3Action(javafx.event.ActionEvent actionEvent) throws IOException {
        this.createPage(homePane,"scene3.fxml");
    }

    @FXML
    public void scene4Action(javafx.event.ActionEvent actionEvent) throws IOException {
        this.createPage(homePane,"scene4.fxml");
    }

    @FXML
    public void scene5Action(javafx.event.ActionEvent actionEvent) throws IOException {
        this.createPage(homePane,"scene5.fxml");
    }




}

