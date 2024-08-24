import java.util.*;

public class mapi {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(100,"Shivam");
		map.put(200,"Mubin");
		map.put(300,"Ashish");
		map.put(400,"Venky");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println(map);
		Set s=map.entrySet();
			System.out.println(s);
	}

}