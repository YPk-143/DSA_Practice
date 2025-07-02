package com.DSA.Patterns;

import java.util.Scanner;

public class ClockPattern {

	/*
	Print Sand glass clock pattern for the given input n

	Input Format

	First line of input contains a single integer N.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print the following sand glass clock pattern as shown.

	Sample Input 0

	5
	Sample Output 0

	* * * * * 
	 * * * * 
	  * * * 
	   * * 
	    * 
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
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
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
