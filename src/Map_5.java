import java.util.*;
public class Map_5 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(10,"vi");
		m.put(22,"Ad");
		m.put(33,"Mi");
		
		Collection c =m.values();
		System.out.println(c);
        
		System.out.println(m.containsKey(10));
		System.out.println(m.containsValue("Ad"));
		
		m.clear();
		System.out.println(m);
		
	}

}
