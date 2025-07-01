package com.DSA.MathProb;

public class FibonaciiSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int result=fibonaciiSeries(a, b);
		System.out.print(result);
	}

	private static int fibonaciiSeries(int a, int b) {
		if(a==0) {
			System.out.println(a);
		}else if(b==1){
			System.out.println(b);
		}
		for(int i=3;i<=10;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		return 0;
	}
}
