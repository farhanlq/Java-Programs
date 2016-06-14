package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class Pattern8 {

	public static void main(String...s){
		System.out.println("Enter the no");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		for(int i=70;i>=65;i--){
			for(int j=65;j<=70;j++){
				System.out.print((char)i);
			}
			System.out.println();
			
			
		}
		}
}
