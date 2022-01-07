
public class Count {

	public static void main(String[] args) {
		String s="anand sir trainer";
		int count=s.length();
		int tcount=s.replace("a","").length();
		int totalcount=count-tcount;
		System.out.println("the total number of occurences of a is "+totalcount);

	}

}
