package assignment;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String...s){
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		int arr[][]=new int[m][n];
		int arrnew[][]=new int[n][m];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=scn.nextInt();
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		
			
	}
}
