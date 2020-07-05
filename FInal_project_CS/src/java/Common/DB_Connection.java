package Common;

import java.sql.DriverManager;
import java.sql.Connection;

public class DB_Connection {

    public static Connection get_connection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/citysermon", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
