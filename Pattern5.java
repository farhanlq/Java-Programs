package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class Pattern5 {

	public static void main(String...s){
		System.out.println("Enter the no");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		for(int i=65;i<=70;i++){
			for(int j=65;j<=70;j++){
				System.out.print((char)j);
			}
			System.out.println();
			
			
		}
		}
}
