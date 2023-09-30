
package org.eduvos.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class eduvosee extends Application{

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        //create Image
        Image image = new Image(new FileInputStream("C:\\Users\\luked\\OneDrive\\Documents\\NetBeansProjects\\ITJVA2-B12\\Week 5\\Eduvos1\\EduvosLogoImage.png"));
        
        //set the image view
        ImageView imageView = new ImageView(image);
        
        //to position image
        imageView.setX(10);
        imageView.setY(10);
        
        //set preserve ration to true (to keep the image ratio as you zoom in or out, so that you can still read the image as clearly as ebfore)
        imageView.setPreserveRatio(true);
        
        //create label
        Label message = new Label();
        //set style
        message.setStyle("-fx-font-family: \"Arial\";"+
                            "-fx-font-size: 35px;"+             //font size is always in pixels
                            "-fx-font-weight: bolder;");
        
        //create the button that will be pressed to display
        Button button = new Button("Greet me");
        //setting the position of the object(button) on the screen
        button.setTranslateX(150);
        button.setTranslateY(20);
        //set the position of the object(label) on the screen
        message.setTranslateX(20);
        message.setTranslateY(20);
        
        //set the style for the button
        button.setStyle( "-fx-font-size: 20px;"+             //font size is always in pixels
                          "-fx-font-weight: bold;"+
                          "-fx-background-color: #15305D;"+
                          "-fx-border-style: solid inside;"+
                          "-fx-border-width: 3;"+
                          "-fx-border-insets: 5;"+
                          "-fx-border-color: white;"+
                          "-fx-text-fill: white;");
        
        //add the action event handler
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                message.setText("Welcome to eduvos app");
            }
        });
        
        //create a Vbox
        VBox root = new VBox();
        
        //set the vertical orientation of the arrangement of the children
        //let the space between the children be 20 (between image and button and label)
        root.setSpacing(20);
        
        //set the padding (distance between the components (root is a VBox here) and the edge of the window
        root.setPadding(new Insets(10 , 10, 10, 10));
        
        //add buttons, image, label to the VBox
        root.getChildren().addAll(imageView, button, message);
        
        //set scene
        Scene scene = new Scene(root, 450, 450);
        
        //get the scene to be added to the stage
        primaryStage.setScene(scene);
        
        //provide the title of the window
        primaryStage.setTitle("eduvos app");
        
        //display the stage
        primaryStage.show();
    }
    
    //main method
    public static void main(String[] args){
        launch(args);   //launch args
    }
}
