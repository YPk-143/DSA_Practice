package com.DSA.MathProb;

import java.util.Scanner;

public class FindTheSumOfCubesOfN {

	/*
	Given positive integer - N, print the sum of cubes of 1st N natural numbers.

	Input Format

	Constraints

	Output Format

	Input Format

	First line will contain number of test case Second line contain T values having a positive integer positive integer - N.

	Constraints

	1<=t<=10^5

	1 <= N <= 10^4

	Output Format

	Print the sum of cubes of 1st N natural numbers.

	Sample Input 0

	2
	4 5
	Sample Output 0

	100
	225
	Explanation 0

	1^3+2^3+3^3+4^3=100

	1^3+2^3+3^3+4^3+5^3=225
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
				long sum = (n * (n + 1L)) / 2L;
				System.out.println(sum * sum);
				// for sum of squares of the n natural numbers formula is
				// ((n*(n+1)/2)*(n*(n+1)/2)).=>> (n*(n+1)/2)*2=>>sum*sum.
			}
		}
	}
}
