package com.persistent.reskill;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				int t = sc.nextInt();
				mat[i][j] = t;
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < min) {
					min = mat[i][j];
				}
			}
		}
		System.out.println("The minimum element is " + min);
		
		sc.close();
	}

}
