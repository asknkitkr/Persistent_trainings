import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        UserDAO dao = new UserDAO();
        ArrayList<User> userList = dao.listUsers();

        System.out.println("Before the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Password", "Age",
                "Role", "CreatedDate", "Status");
        for (User user : userList) {
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", user.getId(), user.getName(),
                    user.getEmail(), user.getPassword(), user.getAge(), user.getRole(), user.getCreatedDate(),
                    user.getStatus());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id :");
        Integer userId = sc.nextInt();
        dao.deleteUser(userId);

        userList = dao.listUsers();

        System.out.println("After the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Id", "Name", "Email", "Password", "Age",
                "Role", "CreatedDate", "Status");
        for (User user : userList) {
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", user.getId(), user.getName(),
                    user.getEmail(), user.getPassword(), user.getAge(), user.getRole(), user.getCreatedDate(),
                    user.getStatus());
        }

        sc.close();
    }

}