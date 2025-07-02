package com.DSA.Patterns;

import java.util.Scanner;

public class PalindromePyramidPattern {

	/*
	Print right-angled triangle pattern using palindrome strings. See example for more details.

	Input Format

	Input contains a integer N - lenght of the right angled triangle.

	Constraints

	1 <= N <= 26

	Output Format

	For the given integer N, print the right angled triangle.

	Sample Input 0

	5
	Sample Output 0

	A 
	A B A 
	A B C B A 
	A B C D C B A 
	A B C D E D C B A
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				int sum = 65 + j;
				System.out.print((char) sum + " ");
			}
			for (int j = i - 1; j >= 1; j--) {
				int sum = 64 + j;
				System.out.print((char) sum + " ");
			}
			System.out.println();
		}
	}
}
