package com.DSA.HackerrankContents;

import java.util.Scanner;

public class CalculateAPowerB {

	/*
	Given two integers a and b. compute a power b.

	Input Format

	First line contain number of test case for each testcase value of a and b will be provided Input contains two positive integers a and b.

	Constraints

	1<=t<=10^3

	1 <= a <=100

	0 <= b <=9

	Output Format

	Print a power b.

	Sample Input 0

	2
	2 3
	3 4
	Sample Output 0

	8
	81
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			// Taking input from the command line.
			int a = sc.nextInt();
			int b = sc.nextInt();

			long pow = 1;// due to avoid negative output constraint long is initialized.
			for (int j = 1; j <= b; j++) {
				pow = pow * a;// Example pow=1*2=> pow=2*2=> similarly it follows.
			}
			System.out.println(pow);// after first iteration printing pow sum.
		}
		sc.close();
	}
}
