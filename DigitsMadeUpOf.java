package org.corejava.simple;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class DigitsMadeUpOf {
	
	// 1 2 3 4 5 6 7 8 9
	public static void main(String...s){
		System.out.println("Enter the digit");
		Scanner scn=new Scanner(System.in);
		String digit=scn.nextLine();
	    int count =0;
		for(int i=0;i<digit.length();i++){
			if(digit.charAt(i)=='1'){
				count=count+2;
			} else if(digit.charAt(i)=='2'){
				count=count+5;
			} else if(digit.charAt(i)=='3'){
				count=count+5;
			} else if(digit.charAt(i)=='4'){
				count=count+4;
			} else if(digit.charAt(i)=='5'){
				count=count+5;
			} else if(digit.charAt(i)=='6'){
				count=count+6;
			} else if(digit.charAt(i)=='7'){
				count=count+3;
			} else if(digit.charAt(i)=='8'){
				count=count+7;
			} else if(digit.charAt(i)=='9'){
				count=count+6;
			} else if(digit.charAt(i)=='0'){
				count=count+6;
			} else {
				
			}
			
		}
		System.out.println(count);
		
	}

}
