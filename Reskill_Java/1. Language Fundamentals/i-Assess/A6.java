package com.persistent.reskill;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			boolean isDistinct = true;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					isDistinct = false;
					break;
				}
			}
			if(isDistinct) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}
