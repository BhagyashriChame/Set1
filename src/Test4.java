import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List l=new ArrayList();
		l.add(101);
		l.add("Hi");
		l.add(22.32);
		l.add(true);
		
		List l1=new ArrayList();
		l1.add(Integer.valueOf(101));
		l1.add("Shri");
		l1.add("32.43");
		l1.add(true);
		System.out.print(l1);
		
		if(l.contains(101))
		{
			
			System.out.print("Found ");
		}
		else
		{
			System.out.print("NotFound");
			
		}
		
	    // checkcontain l1 and l
		
		if (l1.containsAll(l))
			
		{
			System.out.print("Found");
			
		}
		else
		{
			System.out.print("NotFound");
		}
	     l.clear();
	      
	     if(l.isEmpty())
	     {
	    	
	    	 System.out.println("Yes");
	      }
	     else
	     {
	     System.out.println("No");
	     }
	     l1.retainAll(l);
	     System.out.print(l);
	     System.out.print(l1);
	     }
	}
      