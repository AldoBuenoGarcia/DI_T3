/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micontrol;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aldobg
 */
public class MainFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MiControl micontrol = new MiControl();
        
        micontrol.setOnAction(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Clickeado.");
            }
        });
        
        
        
        StackPane root = new StackPane();
        root.getChildren().add(micontrol);
        
        Scene scene = new Scene(root, 500, 360);
        
        primaryStage.setTitle("Mi control1!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
