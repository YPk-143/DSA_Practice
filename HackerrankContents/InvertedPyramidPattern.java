package com.DSA.HackerrankContents;

import java.util.Scanner;

public class InvertedPyramidPattern {

	/*
	Print hollow half inverted pyramid pattern. See example for more details.

	Input Format

	First line of input contains a single integer N - the size of the pyramid.

	Constraints

	1 <= N <= 50

	Output Format

	For the given integer, print hollow half inverted pyramid pattern.

	Sample Input 0

	5
	Sample Output 0

	* * * * * 
	*     * 
	*   * 
	* * 
	* 
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if ((i == n || j == 1 || j == i)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
