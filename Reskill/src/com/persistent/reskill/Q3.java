package com.persistent.reskill;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		System.out.println((n < 0)?"Negative":"Positive");
		
		sc.close();
	}

}

