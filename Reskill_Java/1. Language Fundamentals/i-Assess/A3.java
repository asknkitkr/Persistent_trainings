package com.persistent.reskill;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int temp = n;
		
		for(int i = 1; i < n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		
		System.out.println((temp == sum)?"Perfect number":"Not a perfect number");
		
		sc.close();
	}

}
