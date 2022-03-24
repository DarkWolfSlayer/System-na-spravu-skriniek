import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionClass {
   public Connection connection;
    public  Connection getConnection(){


        String userName="sql11481200";
        String password="MijD1C4g3d";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://sql11.freesqldatabase.com:3306/sql11481200",userName,password);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    } 
}
