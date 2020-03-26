/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stonehunt;

import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Second {
    
    boolean goUp,goDown,goLeft,goRight;
    
   Second(){
       HBox h = new HBox();
       h.setMinHeight(100);
       h.setMinWidth(1900);
       h.setAlignment(Pos.CENTER);
       h.setStyle("-fx-background-color:black");
       
       Image img = new Image("/Images/Background.jpg");
       ImageView BackGround = new ImageView(img);
       BackGround.setFitHeight(900);
       BackGround.setFitWidth(1900);
       
       //MOVEMENT OF BLOCK!
       Image b1 = new Image("/Images/Tressaract.jpg");
       ImageView Block1 = new ImageView(b1);
       Block1.setFitHeight(44);
       Block1.setFitWidth(44);
       Block1.setX(33);
       Block1.setY(23);
       
       Path pathB1 = new Path();
       pathB1.getElements().add(new MoveTo(33,23));
       pathB1.getElements().add(new VLineTo(650));
       
       PathTransition forB1 = new PathTransition(Duration.seconds(2),pathB1,Block1);
       forB1.setCycleCount(PathTransition.INDEFINITE);
       forB1.setAutoReverse(true);
       forB1.play();
       
       //MOVEMENT OF BLOCK2
       Image b2 = new Image("/Images/Tressaract.jpg");
       ImageView Block2 = new ImageView(b2);
       Block2.setFitHeight(44);
       Block2.setFitWidth(44);
       Block2.setX(114);
       Block2.setY(121);
       
       Path pathB2 = new Path();
       pathB2.getElements().add(new MoveTo(114,121));
       pathB2.getElements().add(new VLineTo(899));
       
       PathTransition forB2 = new PathTransition(Duration.seconds(3),pathB2,Block2);
       forB2.setCycleCount(PathTransition.INDEFINITE);
       forB2.setAutoReverse(true);
       forB2.play();
       
       //MOVEMENT OF BLOCK3
       Image b3 = new Image("/Images/Tressaract.jpg");
       ImageView Block3 = new ImageView(b3);
       Block3.setFitHeight(44);
       Block3.setFitWidth(44);
       Block3.setX(195);
       Block3.setY(14);
       
       Path pathB3 = new Path();
       pathB3.getElements().add(new MoveTo(195,14));
       pathB3.getElements().add(new VLineTo(900));
       
       PathTransition forB3 = new PathTransition(Duration.seconds(2),pathB3,Block3);
       forB3.setCycleCount(PathTransition.INDEFINITE);
       forB3.setAutoReverse(true);
       forB3.play();
       
       //MOVEMENT OF BLOCK4
       Image b4 = new Image("/Images/Tressaract.jpg");
       ImageView Block4 = new ImageView(b4);
       Block4.setFitHeight(44);
       Block4.setFitWidth(44);
       Block4.setX(262);
       Block4.setY(67);
       
       Path pathB4 = new Path();
       pathB4.getElements().add(new MoveTo(262,67));
       pathB4.getElements().add(new VLineTo(899));
       
       PathTransition forB4 = new PathTransition(Duration.seconds(1),pathB4,Block4);
       forB4.setCycleCount(PathTransition.INDEFINITE);
       forB4.setAutoReverse(true);
       forB4.play();
       
       //MOVEMENT OF BLOCK5
       Image b5 = new Image("/Images/Tressaract.jpg");
       ImageView Block5 = new ImageView(b5);
       Block5.setFitHeight(44);
       Block5.setFitWidth(44);
       Block5.setX(629);
       Block5.setY(111);
       
       Path pathB5 = new Path();
       pathB5.getElements().add(new MoveTo(629,111));
       pathB5.getElements().add(new VLineTo(899));
       
       PathTransition forB5 = new PathTransition(Duration.seconds(2),pathB5,Block5);
       forB5.setCycleCount(PathTransition.INDEFINITE);
       forB5.setAutoReverse(true);
       forB5.play();
       
       //MOVEMENT OF BLOCK6
       Image b6 = new Image("/Images/Tressaract.jpg");
       ImageView Block6 = new ImageView(b6);
       Block6.setFitHeight(44);
       Block6.setFitWidth(44);
       Block6.setX(693);
       Block6.setY(36);
       
       Path pathB6 = new Path();
       pathB6.getElements().add(new MoveTo(693,36));
       pathB6.getElements().add(new VLineTo(900));
       
       PathTransition forB6 = new PathTransition(Duration.seconds(3),pathB6,Block6);
       forB6.setCycleCount(PathTransition.INDEFINITE);
       forB6.setAutoReverse(true);
       forB6.play();
       
       //MOVEMENT OF BLOCK7
       Image b7 = new Image("/Images/Tressaract.jpg");
       ImageView Block7 = new ImageView(b7);
       Block7.setFitHeight(44);
       Block7.setFitWidth(44);
       Block7.setX(778);
       Block7.setY(14);
       
       Path pathB7 = new Path();
       pathB7.getElements().add(new MoveTo(778,14));
       pathB7.getElements().add(new VLineTo(899));
       
       PathTransition forB7 = new PathTransition(Duration.seconds(4),pathB7,Block7);
       forB7.setCycleCount(PathTransition.INDEFINITE);
       forB7.setAutoReverse(true);
       forB7.play();
       
       //MOVEMENT OF BLOCK8
       Image b8 = new Image("/Images/Tressaract.jpg");
       ImageView Block8 = new ImageView(b8);
       Block8.setFitHeight(44);
       Block8.setFitWidth(44);
       Block8.setX(860);
       Block8.setY(143);
       
       Path pathB8 = new Path();
       pathB8.getElements().add(new MoveTo(860,143));
       pathB8.getElements().add(new VLineTo(900));
       
       PathTransition forB8 = new PathTransition(Duration.seconds(1),pathB8,Block8);
       forB8.setCycleCount(PathTransition.INDEFINITE);
       forB8.setAutoReverse(true);
       forB8.play();
       
       //MOVEMENT OF BLOCK9
       Image b9 = new Image("/Images/Tressaract.jpg");
       ImageView Block9 = new ImageView(b9);
       Block9.setFitHeight(44);
       Block9.setFitWidth(44);
       Block9.setX(916);
       Block9.setY(58);
       
       Path pathB9 = new Path();
       pathB9.getElements().add(new MoveTo(916,58));
       pathB9.getElements().add(new VLineTo(899));
       
       PathTransition forB9 = new PathTransition(Duration.seconds(2),pathB9,Block9);
       forB9.setCycleCount(PathTransition.INDEFINITE);
       forB9.setAutoReverse(true);
       forB9.play();
       
       //MOVEMENT OF BLOCK10
       Image b10 = new Image("/Images/Tressaract.jpg");
       ImageView Block10 = new ImageView(b10);
       Block10.setFitHeight(44);
       Block10.setFitWidth(44);
       Block10.setX(1299);
       Block10.setY(143);
       
       Path pathB10 = new Path();
       pathB10.getElements().add(new MoveTo(1299,143));
       pathB10.getElements().add(new VLineTo(900));
       
       PathTransition forB10 = new PathTransition(Duration.seconds(2),pathB10,Block10);
       forB10.setCycleCount(PathTransition.INDEFINITE);
       forB10.setAutoReverse(true);
       forB10.play();
       
       //MOVEMENT OF BLOCK11
       Image b11 = new Image("/Images/Tressaract.jpg");
       ImageView Block11 = new ImageView(b11);
       Block11.setFitHeight(44);
       Block11.setFitWidth(44);
       Block11.setX(1217);
       Block11.setY(58);
       
       Path pathB11 = new Path();
       pathB11.getElements().add(new MoveTo(1217,58));
       pathB11.getElements().add(new VLineTo(900));
       
       PathTransition forB11 = new PathTransition(Duration.seconds(1),pathB11,Block11);
       forB11.setCycleCount(PathTransition.INDEFINITE);
       forB11.setAutoReverse(true);
       forB11.play();
       
       //MOVEMENT OF BLOCK12
       Image b12 = new Image("/Images/Tressaract.jpg");
       ImageView Block12 = new ImageView(b12);
       Block12.setFitHeight(44);
       Block12.setFitWidth(44);
       Block12.setX(1567);
       Block12.setY(121);
       
       Path pathB12 = new Path();
       pathB12.getElements().add(new MoveTo(1567,121));
       pathB12.getElements().add(new VLineTo(900));
       
       PathTransition forB12 = new PathTransition(Duration.seconds(1),pathB12,Block12);
       forB12.setCycleCount(PathTransition.INDEFINITE);
       forB12.setAutoReverse(true);
       forB12.play();
       
       //MOVEMENT OF BLOCK13
       Image b13 = new Image("/Images/Tressaract.jpg");
       ImageView Block13 = new ImageView(b13);
       Block13.setFitHeight(44);
       Block13.setFitWidth(44);
       Block13.setX(1637);
       Block13.setY(23);
       
       Path pathB13 = new Path();
       pathB13.getElements().add(new MoveTo(1637,23));
       pathB13.getElements().add(new VLineTo(899));
       
       PathTransition forB13 = new PathTransition(Duration.seconds(2),pathB13,Block13);
       forB13.setCycleCount(PathTransition.INDEFINITE);
       forB13.setAutoReverse(true);
       forB13.play();
       
       //MOVEMENT OF THANOS
       Image thanos = new Image("/Images/Thanos.jpg");
       ImageView Thanos = new ImageView(thanos);
       Thanos.setFitHeight(150);
       Thanos.setFitWidth(100);
       Thanos.setX(407);
       Thanos.setY(121);
       
       Path pathThanos = new Path();
       pathThanos.getElements().add(new MoveTo(407,121));
       pathThanos.getElements().add(new VLineTo(800));
       
       PathTransition forThanos = new PathTransition(Duration.seconds(1),pathThanos,Thanos);
       forThanos.setCycleCount(PathTransition.INDEFINITE);
       forThanos.setAutoReverse(true);
       forThanos.play();
       
       //MOVEMENT OF LOKI
       Image loki = new Image("/Images/Loki.jpg");
       ImageView Loki = new ImageView(loki);
       Loki.setFitHeight(150);
       Loki.setFitWidth(100);
       Loki.setX(1401);
       Loki.setY(143);
       
       Path pathLoki = new Path();
       pathLoki.getElements().add(new MoveTo(1401,143));
       pathLoki.getElements().add(new VLineTo(800));
       
       PathTransition forLoki = new PathTransition(Duration.seconds(1),pathLoki,Loki);
       forLoki.setCycleCount(PathTransition.INDEFINITE);
       forLoki.setAutoReverse(true);
       forLoki.play();
       
       //MOVEMENT OF ULTRON
       Image ultron = new Image("/Images/Ultron.jpg");
       ImageView Ultron = new ImageView(ultron);
       Ultron.setFitHeight(150);
       Ultron.setFitWidth(100);
       Ultron.setX(1048);
       Ultron.setY(133);
       
       Path pathUltron = new Path();
       pathUltron.getElements().add(new MoveTo(1048,133));
       pathUltron.getElements().add(new VLineTo(800));
       
       PathTransition forUltron = new PathTransition(Duration.seconds(1),pathUltron,Ultron);
       forUltron.setCycleCount(PathTransition.INDEFINITE);
       forUltron.setAutoReverse(true);
       forUltron.play();
       
       //SETTING THE INFINITY STONES
       Image soulStone = new Image("/Images/SoulStone.jpg");
       ImageView Soul = new ImageView(soulStone);
       Soul.setFitHeight(50);
       Soul.setFitWidth(30);
       Soul.setX(114);
       Soul.setY(21);
      
       Image powerStone = new Image("/Images/PowerStone.jpg");
       ImageView Power = new ImageView(powerStone);
       Power.setFitHeight(50);
       Power.setFitWidth(30);
       Power.setX(553);
       Power.setY(752);
       
       Image realityStone = new Image("/Images/RealityStone.jpg");
       ImageView Reality = new ImageView(realityStone);
       Reality.setFitHeight(50);
       Reality.setFitWidth(30);
       Reality.setX(848);
       Reality.setY(0);
       
       Image spaceStone = new Image("/Images/SpaceStone.jpg");
       ImageView Space = new ImageView(spaceStone);
       Space.setFitHeight(50);
       Space.setFitWidth(30);
       Space.setX(1148);
       Space.setY(820);
       
       Image mindStone = new Image("/Images/MindStone.jpg");
       ImageView Mind = new ImageView(mindStone);
       Mind.setFitHeight(50);
       Mind.setFitWidth(30);
       Mind.setX(1299);
       Mind.setY(21);
       
       Image timeStone = new Image("/Images/TimeStone.jpg");
       ImageView Time = new ImageView(timeStone);
       Time.setFitHeight(50);
       Time.setFitWidth(30);
       Time.setX(25);
       Time.setY(819);
       
       
       
       Image thor = new Image("/Images/Thor.jpg");
       ImageView Thor = new ImageView(thor);
       Thor.setFitHeight(150);
       Thor.setFitWidth(150);
       Thor.relocate(1700,387);
       

              
       AnchorPane pane = new AnchorPane(h);
       pane.setMinHeight(1000);
       pane.setMinWidth(1900);
      // pane.setStyle("-fx-background-color:black");
       
       Button btn = new Button("EXIT");
       btn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
             Platform.exit();     
           }
       });
       
       h.getChildren().addAll(btn);
       
       pane.setBottomAnchor(h,0.0);
       pane.getChildren().addAll(BackGround,Block1,Block2,Block3,Block4,Block5,Block6,Block7,Block8,Block9,Block10,Block11,Block12,Block13,Thanos,Loki,Ultron,Soul,Power,Reality,Space,Mind,Time,Thor);
       
       Scene scene = new Scene(pane);
       Stage stage = new Stage();
       stage.setScene(scene);
       stage.show();
       
       
       scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
           @Override
           public void handle(KeyEvent event) {
               switch(event.getCode()){
                   case UP: goUp=true;break;
                   case DOWN: goDown=true;break;
                   case LEFT: goLeft=true;break;
                   case RIGHT: goRight=true;break;
               }   
           }
       });
       
       scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
           @Override
           public void handle(KeyEvent event) {
               switch(event.getCode()){
                   case UP: goUp=false;break;
                   case DOWN: goDown=false;break;
                   case LEFT: goLeft=false;break;
                   case RIGHT: goRight=false;break;
           }       
          }
       });
       
       AnimationTimer timer = new AnimationTimer(){
           double delta = 4;
           @Override
           public void handle(long now) {
               double currX=Thor.getLayoutX();
               double currY=Thor.getLayoutY();
               
               if(goUp) currY-=delta;
               if(goDown) currY+=delta;
               if(goLeft) currX-=delta;
               if(goRight) currX+=delta;
               Thor.relocate(currX,currY);
           }
       };
       timer.start();
   }
    
}
