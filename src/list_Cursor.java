import java.util.*;

public class list_Cursor {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<>();
		v.add(11);
		v.add(12);
		v.add(22);
		v.add(44);
		
		ListIterator<Integer> e=v.listIterator();
		while(e.hasNext())
		{
			Integer value=e.next();
			System.out.println(value);
		}
		  System.out.println(".............");
		  while(e.hasPrevious()) {
			  Integer value=e.previous();
			  System.out.println(value);
		  }

		
		  
		  ListIterator<Integer> e1=v.listIterator();
			while(e.hasNext())
			{
				Integer value=e.next();
				if(value%2==0)
				{
					e.set(999);
				}
				 System.out.print(v);
				
			}
		  

	}

}
