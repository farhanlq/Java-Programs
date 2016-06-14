package assignment;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class CountDivisors {

	public static void main(String...s){
	Scanner scn=new Scanner(System.in);
	int l=scn.nextInt();
	int r=scn.nextInt();
	int k=scn.nextInt();
	int count=0;
	for(int i=l;i<=r;i++){
	if(i%k==0)
		count++;
	}
	System.out.println(count);
	}
}
