package com.DSA.Patterns;

import java.util.Scanner;

public class DiamondPNCPattern {

	/*
	Print the diamond pattern. See example for more details.

	Input Format

	First line of input contains a single integer N.

	Constraints

	2 <= N <= 80

	Output Format

	For the given integer, print the PNC Diamond Pattern.

	Sample Input 0

	7
	Sample Output 0

	      *
	     ***
	    *****
	   *******
	  *********
	 *****P*****
	****P*N*C****
	 *****C*****
	  *********
	   *******
	    *****
	     ***
	      *
	      */
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			for (int i = 1; i <= num; i++) {
				for (int j = 0; j < num - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i + i) - 1; j++) {
					if ((i - 1 == j && i == num - 1) || (i == num && i - 3 == j)) {
						System.out.print("P");
					} else if ((i == num && j == num - 1)) {
						System.out.print("N");
					} else if ((i == num && i + 1 == j)) {
						System.out.print("C");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			for (int i = num; i >= 1; i--) {
				for (int j = 0; j < num - i + 1; j++) {
					System.out.print(" ");
				}
				for (int j = 2; j < (i + i) - 1; j++) {
					if (i == j && j == num) {
						System.out.print("C");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
}
