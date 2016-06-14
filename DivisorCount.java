package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */

public class DivisorCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the no");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		int count=0;
		for(int i=1;i<no;i++){
			if(no%i==0){
				count++;
			}
		}
		System.out.println("Total no of divisors are "+count);
	}

}
