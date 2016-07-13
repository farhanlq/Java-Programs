package assignment;

import java.util.Scanner;

public class FindPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x1=scn.nextInt();
		int y1=scn.nextInt();
		int x2=scn.nextInt();
		int y2=scn.nextInt();
		int xp=2*x2-x1;
		int yp=2*y2-y1;
		System.out.println(xp+" "+yp);
		

	}

}
