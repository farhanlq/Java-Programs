import java.util.Scanner;


public class Count_Digits {

	public static void main(String...args){
		Scanner scn=new Scanner(System.in);
		String text=scn.nextLine();
		int z = 0, o = 0, t = 0, th = 0, f = 0, fi=0,s=0,se=0,e=0,n=0;
		for(int i=0;i<text.length();i++){
			if(text.charAt(i)=='0'){
				z++;
			} else if(text.charAt(i)=='1'){
				o++;
			} else if(text.charAt(i)=='2'){
				t++;
			} else if(text.charAt(i)=='3'){
				th++;
			} else if(text.charAt(i)=='4'){
				f++;
			} else if(text.charAt(i)=='5'){
				fi++;
			} else if(text.charAt(i)=='6'){
				s++;
			} else if(text.charAt(i)=='7'){
				se++;
			} else if(text.charAt(i)=='8'){
				e++;
			} else if(text.charAt(i)=='9'){
				n++;
			} 
		}
		
		System.out.println("0 "+z);
		System.out.println("1 "+o);
		System.out.println("2 "+t);
		System.out.println("3 "+th);
		System.out.println("4 "+f);
		System.out.println("5 "+fi);
		System.out.println("6 "+s);
		System.out.println("7 "+se);
		System.out.println("8 "+e);
		System.out.println("9 "+n);
		
	}
}
