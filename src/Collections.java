import java.util.*;
class Students implements Comparable<Students>{
	int rollno,marks;
	String name;
	public Students(int rollno,int marks,String name){
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
	}
	public String toString() {
		return"Students [rollno="+ "marks="+marks+"name="+name+"]";
	}
	public int compareTo(Students s) {
		return marks>s.marks?1:-1;
	}
}
public class Collections {

	public static void main(String[] args) {
		List<Students> l=new ArrayList<>();
		l.add(new Students(1,96,"Anand"));
		l.add(new Students(2,76,"Anand="));
		l.add(new Students(3,86,"Anand"));
		
		Collections.sort(l);
		for(Students i:l)
			System.out.println(i);
	}

	private static void sort(List<Students> l) {
		// TODO Auto-generated method stub
		
	}

}
