import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int users = sc.nextInt();

        sc.nextLine();

        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < users; i++) {
            System.out.println("Enter the details of user " + (i + 1));
            String userDetails = sc.nextLine();
            String[] uDetails = userDetails.split(",");
            User user = new User(uDetails[0], uDetails[1], uDetails[2], uDetails[3]);
            userList.add(user);
        }

        System.out.println("Enter the number of cities:");
        int noOfCities = sc.nextInt();
        sc.nextLine();

        ArrayList<CityCount> cityCountList = new ArrayList<>();
        for (int i = 0; i < noOfCities; i++) {
            System.out.println("Enter the name of city " + (i + 1));
            String cityName = sc.nextLine();
            CityCount cityCount = new CityCount(cityName, userList);
            cityCountList.add(cityCount);
            cityCount.start();
        }

        for (CityCount c : cityCountList) {
            c.join();
            System.out.println(c.getCity() + "--" + c.getCount());
        }

        sc.close();
    }
}