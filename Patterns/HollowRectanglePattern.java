package com.DSA.Patterns;

import java.util.Scanner;

public class HollowRectanglePattern {

	/*
	Print hollow rectangle pattern using '*'. See example for more details.

	Input Format

	Input contains two integers W and L. W - width of the rectangle, L - length of the rectangle.

	Constraints

	2 <= W <= 50 2 <= L <= 50

	Output Format

	For the given integers W and L, print the hollow rectangle pattern.

	Sample Input 0

	5 4
	Sample Output 0

	*****
	*   *
	*   *
	*****
	*/
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int wide=sc.nextInt();
        int length=sc.nextInt();
        sc.close();
        for(int i=1;i<=length;i++){
            for(int j=1;j<=wide;j++){
                if(i==1 || i==length || j==1 || j==wide){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}