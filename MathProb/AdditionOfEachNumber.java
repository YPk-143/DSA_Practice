package com.DSA.MathProb;

public class AdditionOfEachNumber {
	public static void main(String[] args) {
		String numStr = "1234567890";
		int sizeStr = numStr.length();
		long result = addingMethod(numStr, sizeStr);
		System.out.println(result);
	}

	private static long addingMethod(String numStr, int sizeStr) {
		int sum = 0;
		for (int i = 0; i < sizeStr; i++) {
			char eachNum = numStr.charAt(i);
			if (eachNum >= 48 && eachNum <= 57) {
				sum = sum + eachNum - 48;
			} else {
				System.out.println(eachNum + " is not a Number");
				return 0;
			}
		}
		return sum;
	}
}
