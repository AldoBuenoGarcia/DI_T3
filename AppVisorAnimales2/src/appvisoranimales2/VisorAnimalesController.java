/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Aldobg
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Aldobg
 */


/*
Variables de instancia de Animales: Se deberá definir una variable de instancia de animales 
como de tipo ObservableList<Animales> y se inicializará llamando al método estático 
FXCollections.observableArrayList(). Este método devuelve un objeto vacío de colección 
(similar a ArrayList) que implementa la interfaz de la Lista observable. 

 Inicializando los animales del ObservableList: se añadirán (add) objetos de animales a la 
colección de animales. Se pasa esta colección al método ListViewsetItems, que vincula el 
ListView al ObservableList. Este enlace de datos permite que ListView muestre los objetos 
de los animales automáticamente. De forma predeterminada, ListView muestra la 
representación de cada String de animal

*/


public class VisorAnimalesController implements Initializable {

    @FXML
    private BorderPane myBpane;
    @FXML
    private ListView<Animales> mylistview;
    @FXML
    private ImageView myImage;
    
    
    //IMAGEN
    Image imagen;
    /*ANIMALES*/
    
    Animales leon = new Animales("Leon","imagenes/leonMin.jpg","imagenes/leonGrande.jpg");
    Animales tiburon = new Animales("Tiburon","imagenes/tiburonMin.png","imagenes/tiburon.jpg");
    Animales lobo = new Animales("Lobo","imagenes/loboMin.png","imagenes/lobo.jpg");
    
    //LISTA
    ObservableList<Animales> animalesObsList;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        animalesObsList = FXCollections.observableArrayList();
        
        animalesObsList.add(leon);
        animalesObsList.add(tiburon);
        animalesObsList.add(lobo);
        
        //imagen = new Image(leon.getImgGrande());        
        //myImage.setImage(imagen);
        
        mylistview.setItems(animalesObsList);
        
        //CELLFACTORY
        mylistview.setCellFactory((ListView<Animales> l) -> new CeldaImagenTexto());
        
        
        //EVENTOS LISTA
        mylistview.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            imagen = new Image(getClass().getResourceAsStream(newValue.getImgGrande()));
            myImage.setImage(imagen);
        });



    }

}
