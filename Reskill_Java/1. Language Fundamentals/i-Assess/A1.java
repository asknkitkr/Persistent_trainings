package com.persistent.reskill;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter college name");
		String clg = sc.next();
		System.out.println("Enter college locality");
		String loc = sc.next();
		System.out.println("Enter college's vision");
		String vis = sc.next();
		System.out.println("Enter college's mission");
		String mis = sc.next();
		System.out.println("Enter the number of departments");
		int dep = sc.nextInt();
		System.out.println("Enter student strength");
		int str = sc.nextInt();
		System.out.println("Enter college rating");
		char rat = sc.next().charAt(0);
		
		System.out.println(
				clg+"\n"+
				loc+"\n"+
				"______________________________\n"+
				"\nVision\n"+vis+
				"\n______________________________\n"+
				"\nMission\n"+mis+
				"\n______________________________\n"+
				"\nNumber of departments\n"+dep+
				"\n______________________________\n"+
				"\nStudent Strength\n"+str+
				"\n______________________________\n"+
				"\nCollege Rating\n"+rat+
                "\n______________________________"
				);		
		sc.close();
	}

}

