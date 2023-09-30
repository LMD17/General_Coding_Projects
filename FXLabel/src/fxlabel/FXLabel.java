package fxlabel;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * @author luked
 */
public class FXLabel extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        //set title
        primaryStage.setTitle("JavaFX Label Example");
        //set Label
        Label label = new Label("Hello, this is the label");
        
        //set Scene
        Scene scene = new Scene(label, 200, 100);
        //add scene to primaryStage and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
       launch(args);
    }


}
