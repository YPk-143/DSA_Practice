package com.DSA.HackerrankContents;

import java.util.Scanner;

public class CheckArmstrongNumber {

	/*
	Check whether a given number is Armstrong number.

	Input Format

	First line contain no of test case-T Next-T Lines contains positive integer - N.

	Constraints

	1<=T<=10^5 0 <= N <= 10^18

	Output Format

	Print "true" if the number is Armstrong number, "false" otherwise.

	Sample Input 0

	2
	153
	21
	Sample Output 0

	true
	false
	Explanation 0

	1^3 + 5^3 + 3^3 = 153
	*/
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner sc=new Scanner(System.in)){
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                long n=sc.nextLong();
                System.out.println(checkAmstrongOrNot(n));
            }
        }
    }
    private static boolean checkAmstrongOrNot(long n){
        long originalNum=n;
        int sum=0;
        int digits=Long.toString(n).length();
        while(n!=0){
            long digit=n%10;
            sum+=Math.pow(digit,digits);
            n/=10;
        }
        return sum==originalNum;
    }
}
