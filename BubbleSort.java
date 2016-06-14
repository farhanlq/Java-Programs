package assignment;
import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of elements in the array");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		int arr[]=new int[no];
		System.out.println("Enter the elements");
		for(int i=0;i<no;i++){
			arr[i]=scn.nextInt();
		}
		
		
		// LOGIC
		
		for(int i=0;i<no-1;i++){
			for(int j=0;j<no-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		for(int i=0;i<no;i++){
			System.out.println(arr[i]);
		}

	}

}
