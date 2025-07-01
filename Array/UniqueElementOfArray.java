package com.DSA.Array;

import java.util.Scanner;

public class UniqueElementOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();// Size of array.
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] == key) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
