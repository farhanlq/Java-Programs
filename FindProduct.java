package assignment;

import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */

public class FindProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
        	arr[i]=scn.nextInt();
        }
        long sum=1;
        Double power=Math.pow(10, 9);
        long res=(long) (power+7);
        for(int i=0;i<num;i++){
        	
        	sum=((sum*arr[i])%res);
        }
        System.out.println(sum);
	}

}
