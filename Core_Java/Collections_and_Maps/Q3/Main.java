package Collections_and_Maps.Q3;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of address");
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, List<Address>> addressMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address " + (i + 1) + " detail");
            String addressStr = sc.nextLine();
            String[] addressArr = addressStr.split(",");
            Address address = new Address(addressArr[0], addressArr[1], addressArr[2], addressArr[3],
                    Integer.parseInt(addressArr[4]));

            if (!addressMap.containsKey(address.getCity())) {
                addressMap.put(address.getCity(), new ArrayList<>());
            }
            addressMap.get(address.getCity()).add(address);
        }

        System.out.println("Enter the city to be searched");
        String searchCity = sc.nextLine();

        List<Address> searchAddresses = addressMap.get(searchCity);
        if (searchAddresses == null) {
            System.out.println("Searched city not found");
        } else {
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
            for (Address address : searchAddresses) {
                System.out.printf("%-15s %-15s %-15s %-15s %d\n", address.getAddressLine1(), address.getAddressLine2(),
                        address.getCity(), address.getState(), address.getPincode());
            }
        }
        sc.close();
    }
}
