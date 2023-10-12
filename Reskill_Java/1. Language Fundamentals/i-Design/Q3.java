package com.persistent.reskill;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Richie = sc.nextInt();
		int Riya = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			if(i%2 == 0) Richie *= 2;
			else Riya *= 2;
		}
		
		System.out.println((Richie+Riya));
		
		sc.close();
	}

}
