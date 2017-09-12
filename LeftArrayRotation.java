import java.util.Scanner;

public class LeftArrayRotation {

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
			int temp = arr[0];
			for (int i = 0; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[size - 1] = temp;

		}
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

}
