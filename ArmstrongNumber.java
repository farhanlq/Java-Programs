package org.corejava.simple;

import java.util.Scanner;

public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		int n=no;
		int res=0;
		while(n!=0){
			int r=n%10;
			res=res+r*r*r;
			n=n/10;
		}
		
		if(no==res)
			System.out.println("Entered Number is Armstrong Number");
		else
			System.out.println("Entered Number is not Armstrong Number");

	}

}
