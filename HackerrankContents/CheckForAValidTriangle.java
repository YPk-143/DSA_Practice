package com.DSA.HackerrankContents;

import java.util.Scanner;

public class CheckForAValidTriangle {

	/*
	Given sides of a triangle, check whether the triangle is valid.

	Input Format

	First line will contain number of testcase for each test case 3 input would be provided in new lines Input contains three integers A, B, C - Sides of the triangle.

	Constraints

	1<=T<=10^5

	1 <= A, B, C <= 10^10

	Output Format

	Print "true" if you can construct a triangle with the given three sides, "false" otherwise.

	Sample Input 0

	2
	4 3 5
	10 20 30
	Sample Output 0

	true
	false
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				long a = sc.nextInt();
				long b = sc.nextInt();
				long c = sc.nextInt();

				System.out.println(checkValidTriangle(a, b, c));
			}
		}
	}

	private static boolean checkValidTriangle(long a, long b, long c) {
		return a + b > c && b + c > a && c + a > b; // if all conditions satisfy then retrun true else false.
		// A valid triangle should be sum of 2 sides should be always > 3rd side for all
		// constraints.
	}
}
