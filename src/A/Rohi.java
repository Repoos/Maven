package A;
import java.util.*;
class Rohi{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	try{
		System.out.println("enter value of a");
		int a=sc.nextInt();
		int b=15;
		System.out.println(a*b);
	}catch(Exception x){
		System.out.println("exception");
	}
		
	finally{
		System.out.println("solved");
	}try{
		String m="rohith";
		char n=m.charAt(4);
		System.out.println(n);
	}
		catch(/*StringIndexOutOfBounds*/Exception x){
		System.out.println("exception");
	}
		
	finally{
		System.out.println("solved");
	}
		
}
}
