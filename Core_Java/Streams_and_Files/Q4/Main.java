import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the airport:");
        String name = sc.nextLine();

        System.out.println("Enter the city name:");
        String city = sc.nextLine();

        System.out.println("Enter the country code:");
        String code = sc.nextLine();

        try {
            FileWriter csv = new FileWriter("airport.csv");

            csv.write(name + "," + city + "," + code);
            csv.flush();
            csv.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}