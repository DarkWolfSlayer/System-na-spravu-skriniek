import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionClass {
   public Connection connection;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","mysql@123");
        //mysql@123 je meno a heslo databazky aby to fungovalo pepegy
        } 
        catch (Expection ee) {
            System.out.println(ee.getMessage());
            return connection;
        }  



    } 

    
}
