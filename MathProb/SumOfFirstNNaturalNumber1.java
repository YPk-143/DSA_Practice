package com.DSA.MathProb;

import java.util.Scanner;

public class SumOfFirstNNaturalNumber1 {

	/*
	Given positive integer - N, print the sum of 1st N natural numbers.

	Input Format

	First line will contain no of test case and for each test case a single input will be provided Input contains a positive integer - N.

	Constraints

	1< T<=10^4

	1<= N <= 10^6

	Output Format

	Print the sum of 1st N natural numbers in new line.

	Sample Input 0

	2
	4
	3
	Sample Output 0

	10
	6
	Explanation 0

	1+2+3+4=10 1+2+3=6
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				long num = sc.nextInt();
				System.out.println(num * (num + 1) / 2);
			}
		}
	}
}
