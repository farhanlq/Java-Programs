package assignment;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */

public class ChangeXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String res="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='x'){
				res=res+"y";
			}
			else {
				res=res+str.charAt(i);
			}
				
		}
		System.out.println(res);
	}

}
