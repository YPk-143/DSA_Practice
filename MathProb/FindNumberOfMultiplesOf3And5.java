package com.DSA.MathProb;

import java.util.Scanner;

public class FindNumberOfMultiplesOf3And5 {

	/*
	First line will contain number of testcases for each test case 1 input would be provided in new line Given a positive integer - N. Print the number of multiples of 3, 5 between [1,N].

	Input Format

	Input contains positive integer - N.

	Constraints

	1 <= T <= 10^5

	1 <= N <=10^18

	Output Format

	Print the number of multiples of 3, 5 in range of 1 to N.

	Sample Input 0

	2
	11
	13
	Sample Output 0

	5
	6
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int count = 0;

			// optimization to avoid for loops in the program.
			count += num / 3 + num / 5 - num / 15;

			System.out.println(count);
		}
		sc.close();
	}
}