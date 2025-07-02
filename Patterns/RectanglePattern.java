package com.DSA.Patterns;

import java.util.Scanner;

public class RectanglePattern {

	/*
	Print rectangle pattern. See example for more details.

	Input Format

	First line of input contains a single integer N - the size of the rectangle.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print rectangle pattern.

	Sample Input 0

	5
	Sample Output 0

	5432*
	543*1
	54*21
	5*321
	*4321
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
			for (int j = n; j >= 1; j--) {
				if (j == i) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
