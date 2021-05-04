/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micontrol;

import com.sun.media.sound.SoftAbstractResampler;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aldobg
 */

/**
 *
 * @author Aldobg
 */
public class MiControl extends Region {

    public MiControl() {
        super();
        // marca la zona donde hacer click
        setStyle("-fx-border-color:red;");
        setPrefSize(100, 100);
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
           
            public void handle(MouseEvent event) {
                onActionProperty().get().handle(event);
            }
        });
    }
    // En este caso se utiliza MouseEvent solo porque llama desde onMouseClicked, se puede sustituir por cualquier
//tipo que se necesite
    private ObjectProperty<EventHandler<MouseEvent>> propertyOnAction
            = new SimpleObjectProperty<EventHandler<MouseEvent>>();

    public final ObjectProperty<EventHandler<MouseEvent>> onActionProperty() {
        return propertyOnAction;
    }

    public final void setOnAction(EventHandler<MouseEvent> handler) {
        propertyOnAction.set(handler);
    }

    public final EventHandler<MouseEvent> getOnAction() {
        return propertyOnAction.get();
    }
}
