package com.DSA.HackerrankContents;

import java.util.Scanner;

public class NumberDiamondPattern1 {

	/*
	Print the number diamond pattern. See example for more details.

	Input Format

	First line of input contains a single integer N.

	Constraints

	2<=n<=9

	Output Format

	For the given integer, print number diamond pattern.

	Sample Input 0

	4
	Sample Output 0

	   1
	  212
	 32123
	4321234
	 32123
	  212
	   1
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
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j > n - i; j--) {
				System.out.print((j + i) - n);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = n; i > 1; i--) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i - 1; j++) {
				System.out.print(i - (j + 1));
			}
			for (int j = 2; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}