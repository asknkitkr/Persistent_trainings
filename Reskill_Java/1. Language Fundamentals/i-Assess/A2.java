package com.persistent.reskill;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char in = sc.next().charAt(0);
		
		if(in >= 'a' && in <= 'z') {
			System.out.println(in + " is lowercase letter");
		} else if(in >= 'A' && in <= 'Z') {
			System.out.println(in + " is uppercase letter");
		} else {
			System.out.println(in + " is neither an uppercase or lowercase letter");
		}
		
		sc.close();
	}
}
