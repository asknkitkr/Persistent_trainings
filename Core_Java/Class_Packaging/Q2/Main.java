import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Complaint> complaints = new ArrayList<>();
        Customer customer = null;

        while (true) {
            System.out.println("Enter the customer name");
            String name = sc.nextLine();

            System.out.println("Enter the id");
            String id = sc.nextLine();
            System.out.println("Enter the country");
            String country = sc.nextLine();
            customer = new Customer(name, id, country);

            System.out.println("Enter the complaint");
            String complaint = sc.nextLine();
            Complaint comp = new Complaint(complaint, customer);
            complaints.add(comp);

            System.out.println("Add another complaint ??");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            } else {
                customer = (Customer) customer.clone();
                customer.name = name;
                customer.id = "";
                customer.country = "";
            }
        }

        System.out.println("Complaint Details");
        for (Complaint comp : complaints) {
            comp.display();
        }
    }
}
