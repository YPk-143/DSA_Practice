package com.DSA.MathProb;

public class CalculateAPowerB {

	public static void main(String[] args) {
		int num= 5;
		int pow = 3;
		int result = calculatingPower(num, pow);
		System.out.println(result);
	}

	private static int calculatingPower(int num, int pow) {
		int p = 1;
		for (int i = 1; i <= pow; i++) {
			p = p * num;
		}
		return p;
	}
}
