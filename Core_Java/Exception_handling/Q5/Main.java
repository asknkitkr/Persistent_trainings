import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the user details");
        String[] p = br.readLine().split(",");

        String name = p[0];
        String mobile = p[1];
        String username = p[2];
        String password = p[3];
        User u = new User(name, mobile, username, password);

        try {
            UserBO.validate(u);
            System.out.println(u);
        } catch (WeakPasswordException e) {
            System.out.println("WeakPasswordException: " + e.getMessage());
        }
    }
}