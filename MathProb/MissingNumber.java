package com.DSA.MathProb;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 8, 10, 6, 9, 5, 7, 3 };

		int result = findMissingNumber(arr);
		System.out.println(result);
	}

	private static int findMissingNumber(int[] arr) {
		int sumOfArr = (arr.length) * (arr.length + 1) / 2;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		System.out.println("Yaswanth");

		return (sumOfArr);
	}
}
