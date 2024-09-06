import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(102);
		l.add("Sakshi");
		l.add(true);
		
		List l1=new ArrayList();
		l1.addAll(l);
		
		System.out.print(l);
		System.out.print(l1);
		
	}

}
