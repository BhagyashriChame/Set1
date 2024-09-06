import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(102);
		l.add("Sakshi");
		l.add(true);
		
		
		List l1=new ArrayList();
		l1.add(Integer.valueOf(101));
		l1.add("Shri");
		l1.add("32.43");
		l1.add(true);
		System.out.print(l1);
		l1.addAll(l);
		l1.removeAll(l);
		System.out.print(l);
		System.out.print(l1);
		l.remove("Sakshi");
		System.out.println(l);

		l.remove(0);
		System.out.println(l);
	}

}
