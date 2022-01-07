import java.util.Scanner;
public class T2 {

	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("Enter array elements");
				int a[]=new int[5];
				int count=0;
				for(int i=0;i<a.length;i++) {
					a[i]=s.nextInt();
				}
for(int i=0;i<a.length;i++) {
	count=0;
	for(int j=0;j<a.length;j++) {
		if(a[i]==a[j]) {
			count++;
		
		}
	}
	System.out.println(+a[i]+" is "+count+ " times Written");
}
	}

}
