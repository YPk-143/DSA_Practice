package com.DSA.HackerrankContents;

import java.util.Scanner;

public class SumOfADigit {

	/*
	Given non-negative integer - N, print the sum of digits of the given number.

	Input Format

	Input contains non-negative integer - N.

	Constraints

	0 <= length(N) <= 10^5

	Output Format

	Print the sum of digits of the given number.

	Sample Input 0

	69
	Sample Output 0

	15
	Explanation 0

	6+9=15
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		long sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch > 47 || ch < 58)
				sum += ch - 48;
		}
		System.out.println(sum);
	}
}
