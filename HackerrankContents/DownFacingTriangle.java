package com.DSA.HackerrankContents;

import java.util.Scanner;

public class DownFacingTriangle {

	/*
	Print down facing triangle as shown

	Input Format

	First line of input contains a single integer N.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print the following down facing triangle pattern as shown.

	Sample Input 0

	5
	Sample Output 0

	*********
	 *     *
	  *   *
	   * *
	    *
	    */
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i + i; j++) {
				if ((i == n || j == 1 || j == (2 * i) - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
