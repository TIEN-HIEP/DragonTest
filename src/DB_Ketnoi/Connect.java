
package DB_Ketnoi;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connect {

    public Connection connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String myURL = "jdbc:sqlserver://localhost;databaseName=DRAGON_BALLS_PROJECT;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(myURL, "sa", "123");      
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connect db = new Connect();
        db.connect();
    }
}
