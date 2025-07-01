package com.DSA.HackerrankContents;

import java.util.Scanner;

public class Pattern5 {

	/*
	 * Print right-angled triangle pattern using integers. See example for more
	 * details.
	 * 
	 * Input Format
	 * 
	 * First line of input contains a single integer N - the size of the triangle.
	 * 
	 * Constraints
	 * 
	 * 1 <= N <= 10
	 * 
	 * Output Format
	 * 
	 * For the given integer, print the right-angled triangle pattern.
	 * 
	 * Sample Input 0
	 * 
	 * 4 Sample Output 0
	 * 
	 * 1 12 123 1234
	 */
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
