package com.DSA.HackerrankContents;

import java.util.Scanner;

public class HarshadNumber {

	/*
	Determine whether the given number is a Harshad number. A Harshad number is an integer, that is divisible by the sum of its digits.

	Input Format

	First line contain no of test case-T Next- Line contains T positive integer .

	Constraints

	1<=T<=10^5 0 <= N <= 10^18

	Output Format

	Print "true" if the number is Harshad number, "false" otherwise.

	Sample Input 0

	2
	18 19
	Sample Output 0

	true
	false
	Explanation 0

	18 / (1 + 8) = 2 As 18 is divisible by the sum of its digits, it is harshad number. 19 / (1 + 9) = 1.9 As 19 is not divisible by the sum of its digits, it is not the harshad number.
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
				System.out.println(isHarshadOrNot(num));
			}
		}
	}

	private static boolean isHarshadOrNot(long num) {
		long OriginalNum = num;
		long sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return OriginalNum % sum == 0;
	}
}
