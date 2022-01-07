import java.util.*;
public class T3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements");
		int r=s.nextInt();
		int a[]=new int[r];
		for(int i=0;i<r;i++) {
			a[i]=s.nextInt();
			
		}
        int j=0,temp;
        for(int i=0;i<r;i++) {
        	if(a[i]<0) {
        		if(i!=j) {
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        		j++;
 
        	}
        }
        for(int i=0;i<r;i++) {
        	System.out.println(a[i]+" ");
        }
	}

}
