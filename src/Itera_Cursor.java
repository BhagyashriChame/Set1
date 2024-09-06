import java.util.*;

public class Itera_Cursor {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<>();
		v.add(101);
		v.add(102);
		v.add(103);
		v.add(104);
		
		Iterator<Integer> e = v.iterator();
		while(e.hasNext())
		{
			Integer value=e.next();
			System.out.println(value);
			
		}

	}

}
