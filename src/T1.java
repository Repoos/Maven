import java.util.*;
public class T1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements");
		int A,Z;
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		A=a[0];
		Z=a[0];
		for(int i=0;i<a.length;i++) {
			if(i==0) {
			}
			if(A>a[i]) A=a[i];
			if(Z<a[i]) Z=a[i];
			if(i==a.length-1)
				System.out.println("Minimum value is = "+A+" Maximum value is = "+Z);
				
		}

	}

}
