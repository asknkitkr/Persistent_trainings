import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code");
        String code = sc.nextLine();

        String formattedCode = code.replace("DH", "DEL").replace("MB", "MUB").replace("KL", "KOL");

        String referenceNumber = formattedCode.substring(3);
        while (referenceNumber.length() < 5) {
            referenceNumber = "0" + referenceNumber;
        }

        StringBuilder formattedCodeBuilder = new StringBuilder();
        formattedCodeBuilder.append(formattedCode.substring(0, 3));
        formattedCodeBuilder.append(referenceNumber);
        formattedCode = formattedCodeBuilder.toString();

        System.out.println("Formatted code");
        System.out.println(formattedCode);
    }
}