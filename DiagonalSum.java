package javaprograms;



import java.util.Scanner;

public class DiagonalSum {

	public static void main(String...s){
		System.out.println("Enter the no");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		int arr[][]=new int[no][no];
		System.out.println("Enter the elements");
				for(int i=0;i<no;i++){
					for(int j=0;j<no;j++){
						arr[i][j]=scn.nextInt();
					}
				}
				
				int res=0;
				
				for(int i=0;i<no;i++){
					for(int j=0;j<no;j++){
					if(i==j){
					res=res+arr[i][j];
					}
					}
				}
				
				System.out.println(res);
				
				
							
				
					
				
				
				
	}
}
