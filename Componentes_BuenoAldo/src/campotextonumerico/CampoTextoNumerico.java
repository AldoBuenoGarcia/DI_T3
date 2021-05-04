/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campotextonumerico;

import static campotextonumerico.CampoTextoNumericoEjemplo.label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author Aldobg
 */
public class CampoTextoNumerico extends TextField {
    
    

    


    //CONSTRUCTOR
    public CampoTextoNumerico() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("campotextonumerico.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    
        //EVENTOS
        @Override
        public void replaceText(int start, int end, String text) {
            if (!text.matches("[a-z, A-Z]")) {
                super.replaceText(start, end, text);
            }
        }

        @Override
        public void replaceSelection(String text) {
            if (!text.matches("[a-z, A-Z]")) {
                super.replaceSelection(text);
            }
        }
    
  
   

   
    

}// FIN CLASE
