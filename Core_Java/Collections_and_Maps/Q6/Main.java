import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of address:");
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Map<String, Integer>> stateCityMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address:");
            String address = sc.nextLine();

            try {
                String[] addressParts = address.split(",");
                if (addressParts.length != 4) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                String area = addressParts[0].trim();
                String city = addressParts[1].trim();
                String state = addressParts[2].trim();
                int pincode = Integer.parseInt(addressParts[3].trim());

                if (!stateCityMap.containsKey(state)) {
                    stateCityMap.put(state, new TreeMap<>());
                }

                Map<String, Integer> cityCountMap = stateCityMap.get(state);
                cityCountMap.put(city, cityCountMap.getOrDefault(city, 0) + 1);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid address format: " + address);
            } catch (NumberFormatException e) {
                System.out.println("Invalid pincode format: " + address);
            }
        }

        System.out.println("Number of entries in city/state wise:");
        for (Map.Entry<String, Map<String, Integer>> stateEntry : stateCityMap.entrySet()) {
            String state = stateEntry.getKey();
            System.out.println("State:" + state);
            Map<String, Integer> cityCountMap = stateEntry.getValue();
            for (Map.Entry<String, Integer> cityEntry : cityCountMap.entrySet()) {
                String city = cityEntry.getKey();
                int count = cityEntry.getValue();
                System.out.println("City:" + city + " Count:" + count);
            }
            System.out.println();
        }
    }
}
