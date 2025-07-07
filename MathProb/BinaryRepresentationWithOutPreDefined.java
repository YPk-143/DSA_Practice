package com.DSA.MathProb;

import java.util.Scanner;

public class BinaryRepresentationWithOutPreDefined {

	/*
	Given a positive integer, print its binary representation.

	Note: Do not use any inbuilt functions/libraries for your main logic.

	Input Format

	First line of input contains T - number of test cases. Its followed by T lines, each line containing a single integer.

	Constraints

	1 <= T <= 10000

	0 <= N <= 10^9

	Output Format

	For each test case, print binary representation, separated by new line.

	Sample Input 0

	5
	10
	15
	7
	1
	120
	Sample Output 0

	1010
	1111
	111
	1
	1111000
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				long num = sc.nextLong();
				System.out.println(binaryRepresntation(num));
			}
		}
	}

	private static StringBuilder binaryRepresntation(long num) {
		StringBuilder sb = new StringBuilder("");
		while (num > 0) {
			long rem = num % 2;
			sb.append(rem);
			num /= 2;
		}
		return sb.reverse();
	}
}
