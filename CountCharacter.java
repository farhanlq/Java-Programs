import java.util.HashMap;
import java.util.Scanner;


public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner scn=new Scanner(System.in);
		String text=scn.nextLine();
		countCharacter(text.toLowerCase());

	}
	private static void countCharacter(String te) {
		// TODO Auto-generated method stub
		HashMap <Character,Integer> hm=new HashMap<Character,Integer>();
		char[] ch=te.toCharArray();
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}
		System.out.println("Character Count "+hm);
		
	}	

}
