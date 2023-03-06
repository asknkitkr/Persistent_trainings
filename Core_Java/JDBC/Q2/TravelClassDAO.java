
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TravelClassDAO {
    ArrayList<TravelClass> listAllTravelClassess() throws ClassNotFoundException, SQLException {

        ArrayList<TravelClass> travelClassList = new ArrayList<TravelClass>();

        Connection con = null;
        try {
            con = DBConnection.getConnection();
            String query = "SELECT name, description FROM travel_class ORDER BY name DESC";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                TravelClass tc = new TravelClass(name, description);
                travelClassList.add(tc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        con.close();

        return travelClassList;
    }

    public void updateDetail(String name, String description) throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement ps = null;

        con = DBConnection.getConnection();
        String sql = "UPDATE travel_class SET description=? WHERE name=?";

        ps = con.prepareStatement(sql);
        ps.setString(1, description);
        ps.setString(2, name);
        ps.executeUpdate();

        ps.close();
        con.close();
    }
}
