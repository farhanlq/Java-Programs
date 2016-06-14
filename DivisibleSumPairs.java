package assignment;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */

public class DivisibleSumPairs {
	
	public static void main(String...s){

		Scanner scn=new Scanner(System.in);	
		int n=scn.nextInt();
		int k=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
	int count=0;
	for(int i = 0;i<n-1;i++){
		for (int j = 1; j < n; j++) {
			if(i<j){
			int res = arr[i]+arr[j];
			if (res%k==0) {
				count++;
				System.out.println("("+i+","+j+")");
			}
		}
		}
	
	}
	System.out.println(count);
	scn.close();

	}
}
