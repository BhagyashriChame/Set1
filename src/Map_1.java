import java.util.*;

public class Map_1 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(101,"Mon");
		m.put(102,"Tue");
		m.put(103,"Wed");
		System.out.println(m);

	   Map<Integer,String>m1=new HashMap<>();
	   m1.putAll(m);
		System.out.print(m1);
		
	}

}
