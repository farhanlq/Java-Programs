import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++){
			arr[i]=scn.nextInt();
		}
		System.out.println("Enter the number to be search ");
		int num=scn.nextInt();
		int pos=binarySearch(arr,0,size,num);
		System.out.println("The Entered Number is found at "+(pos+1));
	}

	public static int binarySearch(int[] arr, int left, int right, int item) {
		// TODO Auto-generated method stub
		if (left < right) {
            int mid = left + (right - left) / 2; 
            if (item < arr[mid]) {
                return binarySearch(arr, left, mid, item);
                 
            } else if (item > arr[mid]) {
                return binarySearch(arr, mid+1, right , item);
                 
            } else {
                return mid;  
            }
        }
        return (left + 1); }
}
