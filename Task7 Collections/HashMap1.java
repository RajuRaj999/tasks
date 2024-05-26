package collections;
import java.util.*;
public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "raj");
		map.put(109, "ravi");
		map.put(103, "abhi");
		map.put(102, "teja");
		map.put(108, "raj");
		map.put(111, "ram");
		System.out.println(map);
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		map.remove(109);
		System.out.println(map);
		}

}
