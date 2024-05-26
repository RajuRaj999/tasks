package collections;
import java.util.*;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("raj");
		set.add("teja");
		set.add("raj");
		set.add("abhi");
		set.add("mani");
		set.add("raj");
		System.out.println(set);
		for(String s:set) {
			System.out.println(s);
		}
		set.remove("teja");
		System.out.println(set);
		int a=set.size();
		System.out.println(a);
		boolean b=set.isEmpty();
		System.out.println(b);
	}

}
