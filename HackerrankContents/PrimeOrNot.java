package com.DSA.HackerrankContents;

import java.util.Scanner;

public class PrimeOrNot {

	/*
	Given a positive integer - N. Check whether the number is prime or not.

	Input Format

	It contains positive integer - N.

	Constraints

	0 <= N <= 10^18

	Output Format

	Print "True" if the number is Prime number, "False" otherwise.

	Sample Input 0

	11
	Sample Output 0

	True
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			long num = sc.nextLong();
			System.out.println(isPrime(num));
		}
	}

	private static String isPrime(long num) {
		if (num <= 1) {
			return "False";
		}
		if (num <= 3) {
			return "True";
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return "False";
			}
		}
		return "True";
	}
}
