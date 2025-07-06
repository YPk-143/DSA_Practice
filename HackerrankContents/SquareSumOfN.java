package com.DSA.HackerrankContents;

import java.util.Scanner;

public class SquareSumOfN {

	/*
	Given N, print the sum of squares of 1st N natural numbers.

	Input Format

	First line contain no of test case-T Next- Line contains T positive integers.

	Constraints

	1<=T<=10^5 1 <= N <= 10^4

	Output Format

	Print the sum of squares of 1st N natural numbers.

	Sample Input 0

	2
	15 3
	Sample Output 0

	1240
	14
	Explanation 0

	1^2+2^2+3^2+4^2+5^2..........15^2=1240

	1^2+2^2+3^2=14
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				long n = sc.nextLong();
				System.out.println(n * (n + 1) * (2 * n + 1) / 6);
				// for sum of squares of the n natural numbers formula is (n*(n+1)*(2*n+1)/6).
			}
		}
	}
}
