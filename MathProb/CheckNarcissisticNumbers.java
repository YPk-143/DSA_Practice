package com.DSA.MathProb;

import java.util.Scanner;

public class CheckNarcissisticNumbers {

	/*
	Given N, check whether it is a Narcissistic number or not. A narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits

	Input Format

	First line contain no of test case-T Next Line contains T positive integer .

	Constraints

	1<=T<=10^5 0 <= N <= 10^18

	Output Format

	Print "true" if the number is Armstrong number, "false" otherwise.

	Sample Input 0

	2
	32 8208
	Sample Output 0

	false
	true
	Explanation 0

	3^2+2^2=6+4,10!=32 8^4 + 2^4 + 0^4 + 8^4 = 8208,8208==8208
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		// Narcissistic Numbers means a number is checking Amstrong num or not by the
		// size of number input is its size of input power of each number.
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				long n = sc.nextLong();
				System.out.println(isNarcissistic(n));
			}
		}
	}

	private static boolean isNarcissistic(long n) {
		int digits = Long.toString(n).length();
		long originalNum = n;
		long sum = 0;
		while (n != 0) {
			long digit = n % 10;
			sum += Math.pow(digit, digits);
			n /= 10;
		}
		return originalNum == sum;
	}
}
