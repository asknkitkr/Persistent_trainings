import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManagementTool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> empList = new ArrayList<>();

        System.out.print("Enter the number of employee: ");
        int n = input.nextInt();

        System.out.println("\n::::ENTER EMPLOYEE NAMES::::");
        for (int i = 0; i < n + 1; i++) {
            String e = input.nextLine();
            empList.add(e);
        }

        System.out.println("\nEmployees are:");
        for (String e : empList) {
            System.out.println(e);
        }

        Collections.sort(empList);

        for (String e : empList) {
            System.out.println(e);
        }

        input.close();
    }
}