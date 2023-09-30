package Employees;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeInfo extends Application {

    private Button btView = new Button("View");
    private Button btInsert = new Button("Insert");
    private Button btUpdate = new Button("Update");
    private Button btClear = new Button("Clear");

    //decalre the text fields
    private TextField tfID = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfFirstName = new TextField();
    private TextField tfMI = new TextField();
    private TextField tfAddress = new TextField();
    private TextField tfCity = new TextField();
    private TextField tfState = new TextField();
    private TextField tfTelephone = new TextField();

    private Label lblStatus = new Label();

    private Statement stmt; //used to query the database

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vBox = new VBox(3);

        //declaring the 1st row
        HBox hBox1 = new HBox(3);
        hBox1.getChildren().addAll(new Label("ID"), tfID);

        //declaring the 2nd row
        HBox hBox2 = new HBox(3);
        hBox2.getChildren().addAll(new Label("Last Name"), tfFirstName, new Label("First Name"), tfLastName, new Label("MI"), tfMI);

        //declaring the 3rd row
        HBox hBox3 = new HBox(3);
        hBox3.getChildren().addAll(new Label("Address"), tfAddress);

        //declaring the 4th row
        HBox hBox4 = new HBox(3);
        hBox4.getChildren().addAll(new Label("City"), tfCity, new Label("State"), tfState);

        //declaring the 5th row
        HBox hBox5 = new HBox(3);
        hBox5.getChildren().addAll(new Label("Telephone"), tfTelephone);

        //placing the hBoxes in vertical
        vBox.getChildren().addAll(hBox1, hBox2, hBox3, hBox4, hBox5);

        //declaring the 6th row
        HBox hBox6 = new HBox(3);
        hBox6.getChildren().addAll(btView, btInsert, btUpdate, btClear);
        hBox6.setAlignment(Pos.CENTER); //set alignment for buttons in stage

        //define the border
        BorderPane pane = new BorderPane();
        pane.setTop(lblStatus);
        pane.setCenter(vBox);
        pane.setBottom(hBox6);

        //Create the scene
        Scene scene = new Scene(pane);  //create scene
        primaryStage.setScene(scene);   //place the scene on the stage
        primaryStage.show();    //display the stage
        primaryStage.setTitle("Employee Database"); //set the stage title

        startDB();
        btView.setOnAction(e -> view()); //lambda for button EventHandler //here we are calling the 'view' method when the button is clicked
        btInsert.setOnAction(e -> insert());
        btUpdate.setOnAction(e -> update());
        btClear.setOnAction(e -> clear());
    }

    //Here we Start databasing
    private void startDB() throws SQLException {

        //Establish connection details 
        String url = "jdbc:mysql://localhost:3306/staffDBase?useUnicode=true&"
                + "useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
                + "serverTimezone=UTC";
        String username = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";

        //(Establish connection) connect to the database 
        try {
            //register the driver
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url, username, password);
            lblStatus.setText("Database connection SUCCESS");

            stmt = conn.createStatement();

        } catch (SQLException e) {
            lblStatus.setText("Database connection failed");

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            lblStatus.setText("Database connection failed");

        }

        //all the trancactions associated with the bottom buttons (view, insert, update, clear)
    }

    private void view() {
        String query = "SELECT * FROM staff WHERE id = " + "'" + tfID.getText().trim() + "'";

        try {
            //execute the query
            ResultSet rs = stmt.executeQuery(query);
            loadDetailsInFields(rs);
        } catch (SQLException e) {
            lblStatus.setText("Record was not found");
        }

    }

    private void loadDetailsInFields(ResultSet rs) throws SQLException {
        if (rs.next()) {
            tfLastName.setText(rs.getString(3));
            tfFirstName.setText(rs.getString(3));
            tfMI.setText(rs.getString(3));
            tfAddress.setText(rs.getString(3));
            tfCity.setText(rs.getString(3));
            tfState.setText(rs.getString(3));
            tfTelephone.setText(rs.getString(3));

            lblStatus.setText("Record found");
        } else {
            lblStatus.setText("Record not found");
        }
    }

    //INSERT method
    private void insert() {
        String insertSTMT = "INSERT INTO staff (ID, LastName, FirstName, MI, Address, State, Telephone)"
                + "VALUES('"
                + tfID.getText().trim() + "','"
                + tfLastName.getText().trim() + "','"
                + tfFirstName.getText().trim() + "','"
                + tfAddress.getText().trim() + "','"
                + tfCity.getText().trim() + "','"
                + tfState.getText().trim() + "','"
                + tfTelephone.getText().trim() + "')";

        try {
            stmt.executeUpdate(insertSTMT);

        } catch (SQLException e) {
            lblStatus.setText("Record was not inserted!");
        }

    }

    //UPDATE method
    private void update() {

    }

    //UPDATE method
    private void clear() {

    }

    //Main method
    public static void main(String[] args) {
        launch(args);
    }
}
