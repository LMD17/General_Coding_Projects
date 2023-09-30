
package mysqltutorial;

import java.sql.*;

public class MySQLTutorial {

    public static void main(String[] args) {

        //Establish connection details 

        String url = "jdbc:mysql://localhost:3306/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        //take note of the username and password you used to create the database 

        String username = "root";

        String password = "";

        String driver = "com.mysql.cj.jdbc.Driver";

 

        try {

            //Establish connection 

            Class.forName(driver).newInstance();

            Connection conn = DriverManager.getConnection(url, username, password);

 

            Statement s = conn.createStatement();

            //Create the query that will display all information from the database

            String query = "Select * FROM studentdetails";

            //Place all records retrieved in a result get

            ResultSet rs = s.executeQuery(query);

            // Iterate through the result set and dieplay the records on the screen

            while (rs.next()) {

                System.out.println(rs.getString("studid") + " " + rs.getString("studname") + " " + rs.getString("studsurname"));

            }

            conn.close();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {

            e.printStackTrace();

        }

    }
}
