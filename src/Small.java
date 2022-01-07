import java.util.*;
public class Small {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int A[]= {12,15,16,18,25,5,1};
		int l=s.nextInt();
		int A[]=new int[l];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++) {
			A[i]=s.nextInt();
			if(A[i]<min) 
				min=A[i];
		}
		
System.out.println(min);
	}

}
