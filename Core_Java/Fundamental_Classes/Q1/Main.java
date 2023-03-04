import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text from the document");
        String text = in.nextLine();
        System.out.println("Enter the string to be found in the data");
        String str = in.nextLine().trim();

        if (text.contains(str)) {
            System.out.println("String is found in the document");
        } else {
            System.out.println("String is not found in the document");
        }

        in.close();
    }
}