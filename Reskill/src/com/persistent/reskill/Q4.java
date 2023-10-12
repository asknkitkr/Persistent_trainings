package com.persistent.reskill;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		int a = sc.nextInt();
		System.out.println("Enter the value of b :");
		int b = sc.nextInt();
		
		int n = a;
		while(n >= b) {
			n -= b;
		}
		
		System.out.println("Remainder is " + n);
		
		sc.close();
	}

}

