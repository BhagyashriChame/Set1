import java.util.*;

public class AddIndex {

	public static void main(String[] args) {
		 List l=new ArrayList();
		 l.add("A");
		 l.add("B");
		 l.add("C");
		 l.add("A");
		 System.out.println(l);
		 l.add(2,"E");
		 System.out.println(l);
		 
		 List l1=new ArrayList();
		 l1.addAll(l);
		 System.out.println(l1);
		 
		 l1.addAll(2,l);
		 System.out.println(l1);
		 
		 List l2=new ArrayList();
		 l2.add(103);
		 l2.add(104);
		 l2.remove(Integer.valueOf(103));
		System.out.print(l2);
		
		List l4=new ArrayList();
		l4.add(104);
		 l4.add(105);
		 l4.add(106);
		 l4.add(107);
		 
		 for(int x=0; x<l4.size();x++)
		 {
			 System.out.println(l4);
			 
		 }
		
		 int
		 
	}

}
