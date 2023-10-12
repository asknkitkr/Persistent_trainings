package com.persistent.reskill;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temparature in Celsius:");
		int C = sc.nextInt();
		
		double F = (9.0 / 5.0) * C + 32;
		
		System.out.printf("Temparature in Fahrenheit is %.1fF%n", F);
		
		sc.close();
	}

}