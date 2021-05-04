/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectorDeslizamiento;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author aldob
 */
public class SelectorDeslizamientoController extends AnchorPane {

    @FXML
    private Button previousButton;
    @FXML
    private Label label;
    @FXML
    private Button nextButton;
    
    
    ArrayList<String> items;
    int selectedIndex;
    private boolean repetitive;
    
    
    private ObjectProperty<EventHandler<ActionEvent>> onAction= new ObjectPropertyBase<EventHandler<ActionEvent>>(){
        @Override
        protected void invalidated(){
            setEventHandler(ActionEvent.ACTION,get());
        }
        @Override
        public Object getBean(){
            return SelectorDeslizamientoController.this;
        }
        @Override
        public String getName(){
            return "onAction";}
    };
    
    
   public SelectorDeslizamientoController(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectorDeslizamiento.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
       
        ArrayList<String> ar = new ArrayList();
        
        ar.add("Uno");
        ar.add("Dos");
        ar.add("Tres");
        
        this.setItems(ar);
       /*
       
      items=new ArrayList<>();*/
      selectedIndex=0;
      
      previousButton.setOnAction((ActionEvent event)->{
        setPrevious();
        fireEvent(event);
        event.consume();
      }
 
      );   
      
      nextButton.setOnAction((ActionEvent event)->{
          setNext();
          fireEvent(event);
          event.consume();
      }
      );
   
   }//fin constructor
   
   
   //METODOS
   
   public void setItems(ArrayList<String>items){
       this.items=items;
       selectFirst();
   }
   public void setPrevious(){
       updateItem(selectedIndex-1);
   }
   public void setNext(){
       updateItem(selectedIndex+1);
   }
   public void selectFirst(){
       updateItem(0);
   }
   private void selectLast(){
       updateItem(items.size()-1);
   }
   
   private void updateItem(){
       if(items.isEmpty()){
           label.setText("Vacio");
       }else{
           if(selectedIndex<0){
               if(repetitive){
                   selectedIndex=items.size()-1;
               }else{
                   selectedIndex=0;
               }
           }
           if(selectedIndex>=items.size()){
               if(repetitive){
                   selectedIndex=0;
               }else{
                   selectedIndex=items.size()-1;
               }
           }
           label.setText(items.get(selectedIndex));
       }
   }
   private void updateItem(int selectedIndex){
       this.selectedIndex=selectedIndex;
       updateItem();
   }
   
   
   public void setRepetitive(boolean cyclesThrough){
       this.repetitive=cyclesThrough;
   }
   public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty(){
       return onAction;
   }
   public final void setOnAction(EventHandler<ActionEvent> value){
       onActionProperty().set(value);
   }
   public final EventHandler<ActionEvent>getOnAction(){
       return onActionProperty().get();
   }
   
   
   
   
}//FIN CLAS
