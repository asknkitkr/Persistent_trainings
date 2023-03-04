package Collections_and_Maps.Q4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of users:");
        int n = sc.nextInt();
        Set<User> userSet = new HashSet<>();
        List<User> userList = new ArrayList<>();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of user" + i);
            System.out.println("Username:");
            String username = sc.nextLine();
            System.out.println("Bank name:");
            String bankname = sc.nextLine();
            User user = new User(username, bankname);
            userSet.add(user);
            userList.add(user);
        }
        System.out.println("Enter username(Expire in one month) separated by comma");
        String[] toExpire = sc.nextLine().split(",");
        List<User> toExpireList = new ArrayList<>();
        for (String s : toExpire) {
            User u = new User(s, null);
            toExpireList.add(u);
        }
        userList.retainAll(toExpireList);
        userSet.retainAll(toExpireList);
        System.out.println("Users going to expire within a month");
        int count = 1;
        for (User u : userList) {
            System.out.println("User " + count);
            System.out.println("User Name = " + u.getUsername());
            System.out.println("Bank Name = " + u.getBankname());
            count++;
        }
    }
}
