package com.DSA.SearchingAlgo;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,5,6,7,8};
		int searchElement=4;
		boolean result=linearSearch(arr,searchElement);
		System.out.println(result);
	}

	private static boolean linearSearch(int[] arr, int searchElement) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchElement) {
				return true;
			}else if(arr[i]>searchElement) {//It correctly works only array is sorted.
				break;
			}
		}
		return false;
	}
}
