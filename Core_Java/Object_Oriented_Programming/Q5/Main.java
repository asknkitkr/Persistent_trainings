package Object_Oriented_Programming.Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[3];
        String stallDetails = "";
        System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                sc.nextLine();
                System.out.println(
                        "Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
                stallDetails = sc.nextLine();
                arr = stallDetails.split(",");
                int cost = Integer.parseInt(arr[1]);
                int num = Integer.parseInt(arr[3]);
                GoldStall gStall = new GoldStall(arr[0], cost, arr[2], num);
                gStall.display();
                break;
            case 2:
                sc.nextLine();
                System.out.println(
                        "Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
                stallDetails = sc.nextLine();
                arr = stallDetails.split(",");
                cost = Integer.parseInt(arr[1]);
                num = Integer.parseInt(arr[3]);
                PremiumStall pStall = new PremiumStall(arr[0], cost, arr[2], num);
                pStall.display();
                break;
            case 3:
                sc.nextLine();
                System.out.println(
                        "Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
                stallDetails = sc.nextLine();
                arr = stallDetails.split(",");
                cost = Integer.parseInt(arr[1]);
                num = Integer.parseInt(arr[3]);
                ExecutiveStall eStall = new ExecutiveStall(arr[0], cost, arr[2], num);
                eStall.display();
                break;
            default:
                System.out.println("Invalid Stall Type");
        }
        sc.close();
    }
}
