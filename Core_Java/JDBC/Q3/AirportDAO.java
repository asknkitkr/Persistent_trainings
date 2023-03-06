import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AirportDAO {
    public void insertAirport(Airport airportIns) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        String sql = "INSERT INTO airport(iata_airport_code,name,city,country_name) VALUES ('"
                + airportIns.getIataAirportCode() + "','" + airportIns.getName() + "','" + airportIns.getCity() + "','"
                + airportIns.getCountry() + "')";
        st.executeQuery(sql);

        st.close();
        con.close();
    }

    public ArrayList<Airport> listAirport() throws ClassNotFoundException, SQLException {
        ArrayList<Airport> airports = new ArrayList<>();

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        String sql = "SELECT iata_airport_code, name, city, country_name FROM airport ORDER BY iata_airport_code ASC";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Airport airport = new Airport();
            airport.setIataAirportCode(rs.getString("iata_airport_code"));
            airport.setName(rs.getString("name"));
            airport.setCity(rs.getString("city"));
            airport.setCountry(rs.getString("country_name"));
            airports.add(airport);
        }

        st.close();
        con.close();

        return airports;
    }
}
