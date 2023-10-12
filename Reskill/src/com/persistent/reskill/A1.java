package com.persistent.reskill;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int XOR = a ^ b;
		int AND = a & b;
		int smallest = XOR & (~AND);
		
		System.out.println(smallest);
		
		sc.close();
	}

}
