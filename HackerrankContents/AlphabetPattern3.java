package com.DSA.HackerrankContents;

import java.util.Scanner;

public class AlphabetPattern3 {

	/*
	Print the following Pattern. See Example for more Details.

	Input Format

	First line of input contains a single integer N - the size of the pattern.

	Constraints

	1 <= N <= 9

	Output Format

	For the given integer, print the following pattern.

	Sample Input 0

	5
	Sample Output 0

	A
	ZB
	YCX
	DWEV
	FUGTH
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			boolean flag = true;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					if (flag) {
						char ch = (char) (65 + sum);
						System.out.print(ch);
						flag = false;
					} else {
						char ch = (char) (90 - sum);
						System.out.print(ch);
						flag = true;
						sum++;
					}
				}
				System.out.println();
			}
		}
	}
}
