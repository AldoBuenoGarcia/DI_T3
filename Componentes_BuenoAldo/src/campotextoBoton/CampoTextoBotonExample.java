/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campotextoBoton;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Aldobg
 */
public class CampoTextoBotonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        CampoTextoBoton customControl = new CampoTextoBoton();
        customControl.setText("Hello!");
        
        stage.setScene(new Scene(customControl));
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
