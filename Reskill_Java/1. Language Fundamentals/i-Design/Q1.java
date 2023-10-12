package com.persistent.reskill;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the cost of A4sheet:");
		int a4 = sc.nextInt();
		System.out.println("Enter the cost of Pen:");
		int pen = sc.nextInt();
		System.out.println("Enter the cost of Pencil:");
		int pencil = sc.nextInt();
		System.out.println("Enter the cost of Eraser:");
		int eraser = sc.nextInt();
		
		System.out.println("Items Details\n"+
				"A4sheet:"+a4+"\n"+
				"Pen:"+pen+"\n"+
				"Pencil:"+pencil+"\n"+
				"Eraser:"+eraser
				);
		sc.close();
	}

}
