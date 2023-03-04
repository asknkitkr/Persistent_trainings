package Features_of_java8.Q1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Expenses> expList = new ArrayList<>();

        System.out.println("Enter expense for food");
        Double cost = sc.nextDouble();
        Expenses foodExpense = new Expenses("food", cost);
        expList.add(foodExpense);
        System.out.println("Enter expense for rent");
        cost = sc.nextDouble();
        Expenses rentExpense = new Expenses("rent", cost);
        expList.add(rentExpense);
        System.out.println("Enter expense for shopping");
        cost = sc.nextDouble();
        Expenses shoppingExpense = new Expenses("shopping", cost);
        expList.add(shoppingExpense);
        System.out.println("Enter expense for groceries");
        cost = sc.nextDouble();
        Expenses groceriesExpense = new Expenses("groceries", cost);
        expList.add(groceriesExpense);
        System.out.println("Enter expense for electricity");
        cost = sc.nextDouble();
        Expenses electricityExpense = new Expenses("food", cost);
        expList.add(electricityExpense);

        System.out.println("Enter salary");
        Double salary = sc.nextDouble();

        Double totalExpenses = expList.stream()
                .map(Expenses::getCost)
                .reduce(0.0, Double::sum);

        if (totalExpenses > salary) {
            System.out.println("Expenses exceeds Salary");
        } else {
            Double savings = salary - totalExpenses;
            System.out.printf("Savings amount will be Rs.%.1f\n", savings);
        }

        sc.close();
    }
}
