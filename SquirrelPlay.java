import java.util.Scanner;

/**
 * 
 * @author FLaeeq
 *
 */
public class SquirrelPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		int temp=scn.nextInt();
		boolean isSummer=scn.nextBoolean();
		System.out.println(squirrelPlay(temp, isSummer));
	}
	public static boolean squirrelPlay(int temp, boolean isSummer){
		if(temp>=60 && temp<=90)
		return true;
		else if (temp>90 &&isSummer==true)
			return false;
		else
			return false;
		
	}

}
