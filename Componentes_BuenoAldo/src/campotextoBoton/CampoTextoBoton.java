/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campotextoBoton;

import java.io.IOException;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class CampoTextoBoton extends HBox {
    
    @FXML private TextField textField;
    @FXML private Button btn;


    public CampoTextoBoton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("campoTextoBoton.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();            
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    public String getText() {
        return textProperty().get();
    }
    
    public void setText(String value) {
        textProperty().set(value);
    }
    
    public StringProperty textProperty() {
        return textField.textProperty();                
    }
    
    public StringProperty btnTextProperty(){
        return btn.textProperty();
    }
    
    public void setBotonText(String value){
        
        btnTextProperty().set(value);
    }  
    
    public Button getButton(){
    
        return this.btn;
    }
   

        
    @FXML
    protected void doSomething() {
        System.out.println("The button was clicked!");
    }
}
