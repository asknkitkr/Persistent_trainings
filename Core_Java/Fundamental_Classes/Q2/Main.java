import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append("Items:\n");

        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\$");
            Item item = new Item(input[0], input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3]));

            sb.append(item.getName()).append(",").append(item.getType()).append(",").append(item.getCost()).append(",");
            if (item.getAvailableQuantity() == 0) {
                sb.append("Not Available\n");
            } else {
                sb.append("Available\n");
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
