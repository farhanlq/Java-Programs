import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int highest=0;
		int secondhighest=0;
		
		System.out.println("Enter the number of elemenst in the aray");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=scn.nextInt();
		}
		for(int n:arr){
			if(highest<n){
				secondhighest = highest;
				highest = n;
				
			}
			else if(secondhighest<n){
				secondhighest = n;
			}
		}
		System.out.println("Highest Number is "+highest);
		System.out.println("Second Highest Number is "+secondhighest);
	}
}
