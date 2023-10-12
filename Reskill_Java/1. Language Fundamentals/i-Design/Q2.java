package com.persistent.reskill;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ticket = "";
		char s = sc.next().charAt(0);
		
		if(s == 'E' || s == 'e' ) {
			ticket = "Early Bird Ticket";
		} else if(s == 'D' || s == 'd') {
			ticket = "Discount Ticket";
		} else if(s == 'V' || s == 'v') {
			ticket = "VIP Ticket";
		} else if(s == 'S' || s == 's') {
			ticket = "Standard Ticket";
		} else if(s == 'C' || s == 'c') {
			ticket = "Child Ticket";
		}
		
		System.out.println(ticket);
		
		sc.close();
	}
}
