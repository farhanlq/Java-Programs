import java.util.Scanner;


public class LastDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++){
		int a=scn.nextInt();
		int b=scn.nextInt();
		double res=Math.pow(a,b);
		System.out.println((int)res%10);
		}
		}

}
