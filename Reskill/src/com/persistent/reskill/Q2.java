package com.persistent.reskill;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		System.out.println(((n&1) != 1)?"Even":"Odd");
		
		sc.close();
	}

}
