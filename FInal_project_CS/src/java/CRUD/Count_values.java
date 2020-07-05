package CRUD;

import Common.DB_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Count_values {

    public static int countQns(int service_id) {
        int count = 0;
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select count(*) from question where service_id=?");
            ps.setInt(1, service_id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            count = rs.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return count;
    }

}
