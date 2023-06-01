import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of users: ");
        int users = Integer.parseInt(br.readLine());

        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < users; i++) {
            System.out.println("Enter the details of user " + (i + 1));
            String userDetails = br.readLine().trim();
            String[] ud = userDetails.split(",");
            User user = new User(ud[0], ud[1], ud[2], ud[3]);
            userList.add(user);
        }

        System.out.println("Enter the number of cities:");
        int noc = Integer.parseInt(br.readLine());

        ArrayList<CityCount> cityCountList = new ArrayList<>();
        for (int i = 0; i < noc; i++) {
            System.out.println("Enter the name of city " + (i + 1));
            String cityName = br.readLine();
            CityCount cityCount = new CityCount(cityName, userList);
            cityCountList.add(cityCount);
            cityCount.start();
        }

        for (CityCount c : cityCountList) {
            c.join();
            System.out.println(c.getCity() + "--" + c.getCount());
        }
    }
}
