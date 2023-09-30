
package javafxtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Extend Application

public class JavaFXTest extends Application {

    

    @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {

        //create a button

        Button btn = new Button();
        Button btn1 = new Button();

        //set button text

        btn.setText("Im HUNGRY");
        btn1.setText("Im Hungry");

        //onaction listener event handler for the button

        btn.setOnAction(new EventHandler<ActionEvent>() {

            

            @Override

            public void handle(ActionEvent event) {

                //output hello world to console

                System.out.println("Bring me food");

            }

        });

        

        StackPane root = new StackPane();

        root.getChildren().add(btn);

        //create a scene

        Scene scene = new Scene(root, 300, 250);

        //set Title as Hello World

        primaryStage.setTitle("Hello World!");

        //place the scene in the stage

        primaryStage.setScene(scene);

        //Display the stage

        primaryStage.show();

    }

 

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        //launch application

        launch(args);

    }
}
