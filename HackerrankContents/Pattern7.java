package com.DSA.HackerrankContents;

import java.util.Scanner;

public class Pattern7 {

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
	 * 1 <= N <= 50
	 * 
	 * Output Format
	 * 
	 * For the given integer, print the right-angled triangle pattern.
	 * 
	 * Sample Input 0
	 * 
	 * 6 Sample Output 0
	 * 
	 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
	 */
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((sum) + " ");
				sum += 1;
			}
			System.out.println();
		}
	}
}
