import java.util.Scanner;

/**
 * 
 * @author FLaeeq
 *
 */
public class AnswerCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		boolean isMorning=scn.nextBoolean();
		boolean isMom=scn.nextBoolean();
		boolean isAsleep=scn.nextBoolean();
		System.out.println(answerCell(isMorning,isMom,isAsleep));
		
	}
	
	private static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		// TODO Auto-generated method stub
		if(!isMorning && isMom || isMorning && isMom && isAsleep)
		return true;
		else if (isAsleep)
			return false;
		else 
			return true;

	}

	


}
