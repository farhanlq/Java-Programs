import java.util.Scanner;


public class EvenFibo {

	public static void main(String...s){
	System.out.println("Enter the number");
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int first=1;
	int second=1;
	int res=1;
	int sum=0;
	while(res<=num){
		if(res%2==0)
			sum=sum+res;
		first=second;
		second=res;
		res=first+second;
	}
	System.out.println(sum);
	}

}
