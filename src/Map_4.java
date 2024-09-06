import java.util.*;

public class Map_4 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(11,"vi");
		m.put(22,"Ad");
		m.put(33,"Mi");
		
		System.out.println(m.isEmpty());
		
		m.replace(22,"Mina");
		System.out.println(m);
		m.replace(11,"vi","Raji");
		System.out.println(m);
		
		System.out.println(m.remove(22));
		
		System.out.println(m.remove(22,"Ad"));
	}

}
