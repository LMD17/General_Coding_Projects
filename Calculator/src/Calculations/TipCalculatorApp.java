package Calculations;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TipCalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //set title
        primaryStage.setTitle("Tip Calculator App");

        //create lables for column idex 0 in grid
        Label amountLabel = new Label("Amount");
        Label tipLabel = new Label("Tip");
        Label totalLabel = new Label("Total");

        //create text area
        TextField amountTextField = new TextField();
        //Create slider
        Slider tipSlider = new Slider(0, 30, 15);
        tipSlider.setShowTickLabels(true);
        tipSlider.setShowTickMarks(true);
        tipSlider.setMajorTickUnit(5);
        tipSlider.setMinorTickCount(0);
        tipSlider.setBlockIncrement(5);
        tipSlider.setSnapToTicks(true);
        //create tip percent text field (from slider)
        Label tipSliderPercentLabel = new Label();
        tipSliderPercentLabel.setText(tipSlider.getValue() + "%");   //try valueProperty() method if getValue() method doesn't work

        TextField tipSliderTextField = new TextField();
        tipSliderTextField.setText(Double.toString(tipSlider.getValue()));

        //create total text field
        TextField totalTextField = new TextField();

        //create calculate button
        Button calculate = new Button("Calculate");

        //add the action event handler
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tipSliderPercentLabel.setText(tipSlider.getValue() + "%");   //try valueProperty() method if getValue() method doesn't work
                tipSliderTextField.setText(Double.toString(tipSlider.getValue()));

                double amount = Double.parseDouble(amountTextField.getText());
                double tipPercent = tipSlider.getValue();
                double tipAmount = amount * tipPercent / 100;
                double total = amount + tipAmount;
                totalTextField.setText("R" + Double.toString(total));
            }
        });

        GridPane gridPane = new GridPane();
        //gridPane.setBackground();

        gridPane.addColumn(0, amountLabel, tipSliderPercentLabel, tipLabel, totalLabel);
        gridPane.addColumn(1, amountTextField, tipSlider, tipSliderTextField, totalTextField, calculate);

        Scene scene = new Scene(gridPane, 450, 450);

        //get the scene to be added to the stage
        primaryStage.setScene(scene);

        //display the stage
        primaryStage.show();
    }

    //main method
    public static void main(String[] args) {
        launch(args);
    }
}
