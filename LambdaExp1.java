import java.util.ArrayList;
import java.util.List;

public class LambdaExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al=new ArrayList<String>();
		al.add("Hello");
		al.add("Hi");
		al.add("AAA");
		al.add("CEFedfG");
		System.out.println(lower(al));
		List<String> al2 =new ArrayList<String>();
		al2.add("ax");
		al2.add("bx");
		al2.add("cx");
		al2.add("bsfdx");
		System.out.println(removeChar(al2));
		
	}
	
	public static List<String> removeChar(List<String> strings){
		List<String>result=new ArrayList<String>();
		    for(int i=0 , l=strings.size();i<l;++i){
		    	result.add(strings.get(i).replace("x",""));
		    }
		
		return result;
		
	}
	
	public static List<String> lower(List<String> strings){
		for(int i=0,l=strings.size();i<l;++i)
		{
		  strings.add(strings.remove(0).toLowerCase());
		}
		return strings;
		
	}	

}
