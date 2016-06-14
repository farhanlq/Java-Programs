package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class BinaryToDecimal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no in Binary Format");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		int dec=0;
		int pow=0;
		while(no>0){
			dec=(int) (dec + ((no%10)*Math.pow(2,pow++)));
			no=no/10;
		}
		System.out.println("No is "+dec);
	}

}
