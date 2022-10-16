package helloworldjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class HelloWorldJavaFX extends Application {
    
    private Label labelText;    // label control field
    
    public static void main(String[] args) {
        launch(args);    //  launch application
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        labelText = new Label("Click to be welcomed...");    // create label control
        
        Button myButton = new Button("Welcome");    // create button control
        myButton.setOnAction(new ButtonClickHandler());    // register event handler
        
        VBox vbox = new VBox(10, labelText, myButton);    // put label and button in vbox with 10 pixels of spacing
        
        Scene scene = new Scene(vbox, 300, 100);    // create scene with vbox as its root node
        
        vbox.setAlignment(Pos.CENTER);    // set scene's alignment to center
        
        primaryStage.setScene(scene);    // add scene to stage
        primaryStage.setTitle("Welcoming Button");    // set stage title
        primaryStage.show();    // show window
    }
    
    class ButtonClickHandler implements EventHandler<ActionEvent> {    // event handler class for myButton
       
       @Override
       public void handle(ActionEvent event) {
           labelText.setText("Hello, World!");
       }
   }
}

// credit to EventDemo.java file on Canvas - https://canvas-prod.ccsnh.edu/courses/49707/files/3589055?module_item_id=1753681