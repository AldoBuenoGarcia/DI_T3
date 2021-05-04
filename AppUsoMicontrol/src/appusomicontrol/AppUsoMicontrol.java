/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusomicontrol;

import java.lang.reflect.Constructor;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import micontrol.MiControl;
import micontrol.MiControlBeanInfo;


/**
 *
 * @author aldob
 */
public class AppUsoMicontrol extends Application {
    
    MiControl miControl;

    
    @Override
    public void start(Stage primaryStage) {
        
        miControl = new MiControl(); 
        introspeccion();
        
        
        miControl.setOnAction(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Estas pulsando la zona roja!");
            }
        });
        
        Pane root = new Pane();
        root.getChildren().add(miControl);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("APP_USO_MICONTROL!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    //METODOS
    
    public void introspeccion(){
        
        //CONSTRUCTORES
        Constructor[] miControlConstr =miControl.getClass().getConstructors();
        
        System.out.println("CONSTRUCTORES");
        System.out.println("---------------");
        
        for(int i=0;i<miControlConstr.length;i++){
            System.out.println("Constructor :" + miControlConstr[i]);
        }
        System.out.println("");
        //MODIFIERS
        System.out.println("Modificadores de acceso(privacidad)");
        System.out.println("--------------------------------------");
        int codModificador= miControl.getClass().getModifiers();
        if(codModificador == 1)
            System.out.println("Modificador: Público");
        else if(codModificador == 2)
            System.out.println("Modificador: Privado");
        else{
            System.out.println("Modificador: " + codModificador);
        }
        
        //
    
    
    }
    
}//FIN CLASE
