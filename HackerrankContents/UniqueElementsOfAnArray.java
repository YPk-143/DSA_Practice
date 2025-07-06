package com.DSA.HackerrankContents;

import java.util.Scanner;

public class UniqueElementsOfAnArray {

	/*
	Print unique elements of the array in the same order as they appear in the input. Note: Do not use any inbuilt functions/libraries for your main logic.

	Input Format

	First line of input contains a single integer N - the size of array and second line contains array elements.

	Constraints

	1 <= N <= 1000

	0 <= ar[i] <= 10^3

	Output Format

	Print unique elements of the array.

	Sample Input 0

	7
	5 4 10 9 21 4 10
	Sample Output 0

	5 9 21
	*/
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
