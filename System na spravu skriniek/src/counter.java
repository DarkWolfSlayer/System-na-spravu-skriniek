
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class counter {
    private int obsadene;
    private int pocet;
    private int volne;
    
    void pocet_skriniek() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemnaspravuskriniek", "root", "");
            Statement sta = connection.createStatement();

            String query = "SELECT COUNT(*) FROM databaza_skriniek";

            ResultSet rs = sta.executeQuery(query);
            rs.next();

            obsadene = rs.getInt(1);
            pocet = 50;
            volne = pocet - obsadene;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    int getPocet(){
        return pocet;
    }
    
    int getObsadene(){
        return obsadene;
    }
    
    int getVolne(){
        return volne;
    }
}
