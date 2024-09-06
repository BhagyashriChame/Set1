import java.util.*;

public class Itera1_Cursor {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<>();
		v.add(11);
		v.add(12);
		v.add(22);
		v.add(44);
		
		Iterator<Integer> e=v.iterator();
		while(e.hasNext())
		{
			Integer value=e.next();
			if(value%2==0)
			{
				e.remove();
			}
		}
		  System.out.println(v);

	}

}
