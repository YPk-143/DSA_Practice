package com.DSA.HackerrankContents;

import java.util.Scanner;

public class BinaryPattern3 {

	/*
	Print the binary Pattern for the given value n

	Input Format

	First line of input contains a single integer N.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print the following pattern as shown.

	Sample Input 0

	5
	Sample Output 0

	10101
	01010
	10101
	01010
	10101
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean flag = true;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (flag) {
					System.out.print(1);
					flag = false;
				} else {
					System.out.print(0);
					flag = true;
				}
			}
			System.out.println();
		}
	}
}
