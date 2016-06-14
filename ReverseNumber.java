import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		for(int i=0;i<tc;i++){
		int num=scn.nextInt();
		int n=num;
		int res=0;
		while(n!=0){
			int r=n%10;
			res=res*10+r;
			n/=10;
		}
		System.out.println(res);
	}
	}

}
