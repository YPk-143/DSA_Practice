package com.DSA.MathProb;

public class HarshadNumber {

	public static void main(String[] args) {
		int num = 19;
		int divisor = 9;
		System.out.println("Number is: " + num + " Divisor is: " + divisor);
		boolean checkHarshad = harshadOrNot(num, divisor);
		if (checkHarshad == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean harshadOrNot(int num, int divisor) {
		while (num != 0) {
			int rem = num % divisor;
			if (rem == 0)
				return true;
			else
				return false;
		}
		return false;
	}
}
