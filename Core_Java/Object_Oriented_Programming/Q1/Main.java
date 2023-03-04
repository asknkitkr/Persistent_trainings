import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the staff:");
        String name = in.nextLine();
        System.out.println("Enter the staff designation:");
        String designation = in.nextLine();
        System.out.println("Enter the department name:");
        String department = in.nextLine();

        Staff staff = new Staff(name, designation);
        Department d = new Department(department, staff);
        d.display();

        in.close();
    }
}
