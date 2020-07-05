package CRUD;

import Common.DB_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Edit_values {

    public static void updateBookingStatusBySP(int assign_id) {
        try {
            String query = "update assign_sp set status=? where assign_id=?";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);

            pst.setInt(1, 1);
            pst.setInt(2, assign_id);
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
