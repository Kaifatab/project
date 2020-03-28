/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sone;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Sone extends Application {
    
    @Override
    public void start(Stage stage) {
        BorderPane pane = new BorderPane();
        pane.setMinHeight(600);
        pane.setMinWidth(749);
        
        Text txt = new Text("Welcome To The World Of Avengers!!!");
        txt.setFill(Color.BEIGE);
        txt.setFont(Font.font("verdana",FontWeight.BOLD,FontPosture.REGULAR,30));
        txt.setStrokeWidth(2);
        txt.setStroke(Color.CADETBLUE);
        
        VBox v = new VBox();
        v.setMinHeight(75);
        v.setMinWidth(500);
        v.setAlignment(Pos.CENTER);
        v.setStyle("-fx-background-color:black");
        v.getChildren().add(txt);
        
        Button btn = new Button("Let's Start");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               second box = new second();
               stage.close();
            }
        });
        
        HBox h = new HBox();
        h.setMinHeight(75);
        h.setMinWidth(500);
        h.setAlignment(Pos.CENTER);
        h.setStyle("-fx-background-color:black");   
        
        h.getChildren().add(btn);
        
        Image ig = new Image("/images/Avenger.jpg");
        ImageView i = new ImageView(ig);
        
        pane.setTop(v);
        pane.setBottom(h);
        pane.setCenter(i);
        
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
