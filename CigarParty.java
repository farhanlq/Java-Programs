import java.util.Scanner;

public class CigarParty {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cigars = scn.nextInt();
		boolean isWeekend = scn.nextBoolean();
		System.out.println(cigarParty(cigars, isWeekend));
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {

		if (cigars >= 40 && cigars <= 60 ){
			return true;}
		else if ((cigars < 40 && isWeekend == true || isWeekend == false)){
		return false;}
		return true;
		
		
	}
}
