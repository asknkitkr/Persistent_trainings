package Class_Packaging.Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Complaint> complaints = new ArrayList<>();
        boolean flag = true;
        String prevName = "";
        while (flag && complaints.size() < 100) {
            System.out.println("Enter the customer name");
            String name = sc.nextLine();
            if (name.equals("")) {
                if (prevName.equals("")) {
                    System.out.println("No previous customer found");
                    continue;
                }
                Customer prevCustomer = complaints.get(complaints.size() - 1).customer;
                try {
                    Customer cloneCustomer = (Customer) prevCustomer.clone();
                    System.out.println("Enter the complaint");
                    String complaint = sc.nextLine();
                    Complaint newComplaint = new Complaint(complaint, cloneCustomer);
                    complaints.add(newComplaint);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Enter the id");
                String id = sc.nextLine();
                System.out.println("Enter the country");
                String country = sc.nextLine();
                System.out.println("Enter the complaint");
                String complaint = sc.nextLine();
                Customer customer = new Customer(name, id, country);
                Complaint newComplaint = new Complaint(complaint, customer);
                complaints.add(newComplaint);
                prevName = name;
            }
            System.out.println("Add another complaint ??");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("no"))
                flag = false;
        }

        System.out.println("Complaint Details");
        for (int i = 0; i < complaints.size(); i++) {
            complaints.get(i).display();
        }

        sc.close();
    }
}
