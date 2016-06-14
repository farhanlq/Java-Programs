import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++){
			arr[i]=scn.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int num=scn.nextInt();
		
		
		System.out.println("Entered Number is at "+(linearSearch(arr,num,size)+1)+" position");
	}
	
	public static int linearSearch(int arr[],int num,int size){
		for(int j=0;j<size;j++){
			if(num==arr[j])
				return j;
			
			}
		return -1;
		
	}

}
