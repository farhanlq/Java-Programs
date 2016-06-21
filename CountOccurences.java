import java.util.HashMap;
import java.util.Scanner;


public class CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scn.nextInt();
		}
		wordCount(arr);
	}

	private static void wordCount(int[] arr) {
		// TODO Auto-generated method stub
		HashMap <Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i:arr){
			if(hm.containsKey(i)){
				hm.put(i, hm.get(i)+1);
			}
			else{
				hm.put(i, 1);
			}
		}
		System.out.println("Element Count "+hm.toString());
	}

}
