import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
	public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the size of array ");
	Scanner scn=new Scanner(System.in);
	int size=scn.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=scn.nextInt();
	}

	int largest = arr[0];
	int secondLargest =0;
	int number;
	for(int i=1;i<arr.length;i++){
		number = arr[i];
		if (number > largest) {
        secondLargest = largest;
        largest = number;}
    else  if (number > secondLargest) {
            secondLargest = number;
    }
   
	}
	System.out.println("Second Largest Number is "+secondLargest);
	}

}
