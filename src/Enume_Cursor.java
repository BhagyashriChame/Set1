import java.util.*;

public class Enume_Cursor {

	
		public static void main(String[] args) {
			
			Vector<Integer> v =new Vector<>();
			v.add(101);
			v.add(102);
			v.add(103);
			v.add(104);
			
			Enumeration<Integer> e = v.elements();
			while(e.hasMoreElements())
			{
				Integer value=e.nextElement();
				System.out.println(value);
				
			}
			
			
			
		}

	}


