package com.DSA.Array;

import java.util.Arrays;

public class FindMaxMinMaxSumMinSumTotalSumOfArray {

	public static void main(String[] args) {
		// int[] arr = { 5, 4, 9, -1, 2 };
		int[] arr = { 4, -1, 3, -2, 7 };
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sorted arr is: " + Arrays.toString(arr));

		System.out.println("Max element in arr is: " + arr[arr.length - 1]);
		System.out.println("Min element in arr is: " + arr[0]);
		System.out.println(sum);
		System.out.println("Max Sum of Array is: " + (sum - arr[0]));
		System.out.println("Min Sum of Array is: " + (sum - arr[arr.length - 1]));
	}
}
