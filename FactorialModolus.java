package assignment;

import java.io.IOException;
import java.util.Scanner;

public class FactorialModolus {
public static void main(String...s) throws IOException{
	Scanner scn=new Scanner(System.in);
	int no=scn.nextInt();
	long fact=1;
	//int res=1;
	for(int i=no;i>=1;i--){
		fact=fact*i;
	}
	System.out.println(fact%14567);
}
}
