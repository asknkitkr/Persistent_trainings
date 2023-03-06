
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of TravelClass :");
        String name = br.readLine();
        System.out.println("Enter the description to update :");
        String description = br.readLine();

        TravelClassDAO dao = new TravelClassDAO();

        dao.updateDetail(name, description);

        ArrayList<TravelClass> travelClasses = dao.listAllTravelClassess();

        System.out.println("Updated List of Travel Classes");
        System.out.format("%-25s %s\n", "Name", "Description");
        for (TravelClass travelClass : travelClasses) {
            System.out.format("%-25s %s\n", travelClass.getName(), travelClass.getDescription());
        }
    }
}
