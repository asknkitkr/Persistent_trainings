package Multithreading.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines");
        int n = sc.nextInt();

        sc.nextLine();
        Article[] articles = new Article[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line " + (i + 1));
            String line = sc.nextLine();
            articles[i] = new Article(line);
            articles[i].start();
        }

        int totalCount = 0;
        for (Article article : articles) {
            try {
                article.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            totalCount += article.getCount();
        }

        System.out.println("There are " + totalCount + " articles in the given input");

        sc.close();
    }
}
