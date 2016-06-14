package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class Pattern1 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the no");
			Scanner scn=new Scanner(System.in);
			int no=scn.nextInt();
			for(int i=1;i<=no;i++){
				for(int j=1;j<=no;j++){
					System.out.print("*");
				}
				System.out.println();
		}
	scn.close();
			
	}

}
