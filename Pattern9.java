package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class Pattern9 {

	public static void main(String...s){
		System.out.println("Enter the no");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
			
			
		}
		}
}
