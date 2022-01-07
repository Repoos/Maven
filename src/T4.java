import java.util.*;
public class T4 {
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the value of r");
   int r=s.nextInt();
   for(int i=1;i<=r;i++) {
	   for(int j=1;j<i;j++) {
		   System.out.print((i)+" * ");
	   }
	   System.out.println(i);
   }
   for(int i=r;i>=1;i--) {
	   for(int j=1;j<i;j++) {
		   System.out.print((i)+" * ");
	   }
	   System.out.println(i);
   }
}
}
