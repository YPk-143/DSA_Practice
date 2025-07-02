package com.DSA.Patterns;

import java.util.Scanner;

public class Pattern8 {

	/*
	Print right-angled triangle pattern. See example for more details.

	Input Format

	First line of input contains a single integer N - the size of the triangle.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print the right-angled triangle pattern.

	Sample Input 0

	5
	Sample Output 0

	1
	2 6
	3 7 10
	4 8 11 13
	5 9 12 14 15
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
			int sum = i;
			int calculate = n - 1;
			for (int j = 0; j < i; j++) {
				if (j >= 1) {
					sum += calculate;
					System.out.print(sum + " ");
					calculate--;
				} else {
					System.out.print(sum + " ");
				}
			}
			System.out.println();
		}
	}
}