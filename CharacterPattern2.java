import java.util.Scanner;


public class CharacterPattern2 {
public static void main(String...s){
	Scanner scn=new Scanner(System.in);
	//int tc=scn.nextInt();
	//for(int t=0;t<tc;t++){
	int row=scn.nextInt();
	int col=scn.nextInt();
	char arr[][]=new char[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			if((i+j)%2==0){
				arr[i][j]='*';
			}
			else{
				arr[i][j]='.';
			}
		}
	}
	
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	//}
	
}
}
