package assignment;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class ArraySum {

	public static void main(String...s){
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int sum=0;
	int arr[]=new int[num];
	for(int i=0;i<num;i++){
		arr[i]=scn.nextInt();
	}
	for(int i=0;i<num;i++){
		sum=sum+arr[i];
	}
	System.out.println(sum);
	}
}
