import java.sql.*;
import java.sql.DriverManager;

public class MyDBS {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "password"
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
            }
        }
        catch (SQLException e){
            System.out.println("Error");
        }
    }
}
