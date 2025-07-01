package com.DSA.MathProb;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 143;
		boolean result = checkArmstrongOrNot(num);

		if(result==true)
			System.out.println("It is a Armstrong Number.");
		else
			System.out.println("Not a Armstrong Number.");
	}

	private static boolean checkArmstrongOrNot(int num) {
		int originalNum = num;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}
		if (sum == originalNum)
			return true;
		return false;
	}
}
