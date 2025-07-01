package com.DSA.MathProb;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 8, 10, 6, 9, 5, 7, 3 };

		int result = findMissingNumber(arr);
		System.out.println(result);
	}

	private static int findMissingNumber(int[] arr) {
		// By using Brute force Technique.
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				return num;
			}
		}
		return 0;
	}
}
