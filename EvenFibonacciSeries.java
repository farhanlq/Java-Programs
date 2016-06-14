package assignment;

import java.util.Scanner;

public class EvenFibonacciSeries {
	public static void main(String...s){
	System.out.println("Enter the number");
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int first=0;
	int second=1;
	int res;
	int sum=0;
	for(int i=2;i<num-2;i++){
		res=first+second;
		first=second;
		second=res;
		if(res%2==0){sum=sum+res;}
	}System.out.println(sum);
			
		}
}

