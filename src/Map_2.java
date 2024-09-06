import java. util.*;
public class Map_2 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(10,"priya");
		m.put(12,"Renu");
		m.put(13,"Siya");
		System.out.println(m.get(10));
       Set s=m.keySet();
       System.out.println(s);
		
	}

}
