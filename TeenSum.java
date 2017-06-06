import java.util.Scanner;

/**
 * 
 * @author FLaeeq
 *
 */
public class TeenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(teenSum(a, b));

	}

	public static int teenSum(int a, int b) {
		if (a < 13 && b < 13)
			return a + b;
		else if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
			return 19;
		else
			return a+b;
	}
}
