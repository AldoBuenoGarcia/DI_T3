/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectorDeslizamiento;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author aldob
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        SelectorDeslizamientoController selector = new SelectorDeslizamientoController();
        
       
        
        selector.setOnAction((ActionEvent event)->{
            System.out.println("Evento lanzado!!");
            System.out.println("Hola1");
            System.out.println("hola2");
      
        //Hacer algo cuando se capture el evento
        
        });
        /*
        
        */
       
        
        StackPane root = new StackPane();
        root.getChildren().add(selector);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Hello World!");
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
