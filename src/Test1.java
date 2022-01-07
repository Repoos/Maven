import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean b=false;
		int n=s.nextInt();
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				b=true;
			}
		}if(!b) {
			int r,k;
			int count=0;
			String s1=String.valueOf(n);
			int l=s1.length();
			for(int i=0;i<l;i++) {
				r=n%10;
				k=n/10;
				String s2=String.valueOf(r);
				String s3=String.valueOf(k);
				String s4=s2+s3;
				n=Integer.parseInt(s4);
				int n1=Integer.parseInt(s4);
				boolean p=false;
				for(int j=2;j<n1;j++) {
					if(n1%j==0) {
						p=true;
					}
				}if(!p) {
					count++;
				}
			}if(count==1) {
				System.out.println("Circular Prime");
			}else {
				System.out.println("Not a Circular Prime");
			}
		}else {
			System.out.println("Not a Circular Prime");

	}

	}
}
