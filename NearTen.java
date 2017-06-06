import java.util.Scanner;

/**
 * 
 * @author FLaeeq
 *
 */
public class NearTen {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(nearTen(num));
	}

	public static boolean nearTen(int num) {
		return (num % 10 <= 2) ? true : (num % 10 >= 8) ? true : false;
	}

}
