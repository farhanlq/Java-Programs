import java.util.Scanner;

public class RightArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		int d = scn.nextInt();
		for (int j = 0; j < d; j++) {
			int temp = arr[size-1];
			for (int i = size-1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;

		}
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

}
