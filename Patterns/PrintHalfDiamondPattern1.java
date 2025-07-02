package com.DSA.Patterns;

import java.util.Scanner;

public class PrintHalfDiamondPattern1 {

	/*
	Print half diamond pattern using '*'. See example for more details.

	Input Format

	Input contains a single integer N.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print the half diamond pattern.

	Sample Input 0

	3
	Sample Output 0

	*
	**
	***
	**
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
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
