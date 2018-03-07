import java.util.Scanner;

/**
 * @author FLaeeq
 *
 */
public class Factorial_Demo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		int noTestCases[] = new int[tc];
		int noOfTrailZeros[] = new int[tc];
		for (int j = 0; j < tc; j++) {
			noTestCases[j] = scn.nextInt();

			int num = noTestCases[j];
			int result = 0;
			for (int i = 1; i <= String.valueOf(num).length(); i++) {
				while (num != 0) {
					result = result + (int) (num / Math.pow(5, i));
					num = num / 5;
				}
			}
			noOfTrailZeros[j] = result;

		}

		for (int k = 0; k < tc; k++) {
			System.out.println(noOfTrailZeros[k]);
		}

		scn.close();
	}
}
