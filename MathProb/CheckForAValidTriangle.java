package com.DSA.MathProb;

public class CheckForAValidTriangle {

	// condition for checking a valid Triangle or not is
	// 2 sides length sum is more than the other side length.

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 11;
		boolean result = validTriangleOrNot(a, b, c);
		if (result == true)
			System.out.println("It is a valid Triangle length coordinates.");
		else
			System.out.println("We can't draw a Triangle by those length coordinates.");
	}

	private static boolean validTriangleOrNot(int a, int b, int c) {
		if (a + b > c && b + c > a && c + a > b)
			return true;
		return false;
	}
}
