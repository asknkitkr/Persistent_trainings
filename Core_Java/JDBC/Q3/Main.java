import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName, airportCode, airportName, city;
        System.out.println("Enter the Airport Code :");
        airportCode = br.readLine();
        System.out.println("Enter the Airport name :");
        airportName = br.readLine();
        System.out.println("Enter the City :");
        city = br.readLine();
        System.out.println("Enter the Country name :");
        countryName = br.readLine();

        Airport airport = new Airport(airportCode, airportName, city, countryName);

        AirportDAO dao = new AirportDAO();
        dao.insertAirport(airport);

        System.out.format("%-10s %-40s %-10s %s\n", "IATA Code", "Name", "City", "Country");

        ArrayList<Airport> airportList = dao.listAirport();
        Collections.sort(airportList, (a1, a2) -> a1.getIataAirportCode().compareTo(a2.getIataAirportCode()));

        for (Airport a : airportList) {
            System.out.format("%-10s %-40s %-10s %s\n", a.getIataAirportCode(), a.getName(), a.getCity(),
                    a.getCountry());
        }
    }
}
