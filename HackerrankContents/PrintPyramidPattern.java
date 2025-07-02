package com.DSA.HackerrankContents;

import java.util.Scanner;

public class PrintPyramidPattern {

	/*
	Print pyramid pattern. See example for more details.

	Input Format

	First line of input contains a single integer N - the size of the pyramid.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print pyramid pattern.

	Sample Input 0

	5
	Sample Output 0

	    *
	   ***
	  *****
	 *******
	*********
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
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
