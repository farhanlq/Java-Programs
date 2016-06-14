import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class GCDandLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int A=scn.nextInt();
		int B=scn.nextInt();
		int gres=GCD(A,B);
		System.out.println(gres);
		int lres=lcm(A,B);
		System.out.println(lres);
		
	}
	
	public static int GCD(int a, int b) {
	    if (b == 0) return a;
	    else return (GCD (b, a % b));
	}

	static int lcm(int a, int b)
	{
	 	    return (a * b) / GCD(a,b);
	}
}
