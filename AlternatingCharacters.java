import java.util.Scanner;


public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		scn.nextLine();
		String text[]=new String[tc];
		for(int i=0;i<text.length;i++){
			text[i]=scn.nextLine();
		}
		
		for(int k=0;k<text.length;k++){
			String str=text[k];
		int match=0;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				match++;
			}
		}
		
		System.out.println(match);
	}
	}
}

