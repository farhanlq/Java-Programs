package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		int f=0;
		int s=1;
		int next;
		int res=f+s;
		System.out.print(f+" "+s);
		for(int i=2;i<no;i++)
		{
		next=f+s;
		System.out.print(" "+next);
		res=res+next;
		f=s;
		s=next;

	}
		System.out.println();
		//sum of fibonacci terms
		
		System.out.println(res);
	}
}
