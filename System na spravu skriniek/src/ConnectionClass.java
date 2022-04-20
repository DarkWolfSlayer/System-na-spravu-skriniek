import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionClass {
   public Connection connection;
    public  Connection getConnection(){


        String USERNAME = "root";
        String PASSWORD = "";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spravca",USERNAME,PASSWORD);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    } 
}
