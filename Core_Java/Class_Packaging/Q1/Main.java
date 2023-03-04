import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = scanner.nextLong();
        product.setId(id);
        scanner.nextLine();
        System.out.println("Enter the product name");
        String productName = scanner.nextLine();
        product.setProductName(productName);
        System.out.println("Enter the supplier name");
        String supplierName = scanner.nextLine();
        product.setSupplierName(supplierName);
        System.out.println(product.toString());
        System.out.println("Invoking getClass() method : " + product.getClass());
        scanner.close();
    }
}
