package collections;
import java.util.*;
public class Vector1 {
	public static void main(String[] args) {
		Vector<String>v=new Vector<String>();
		v.add("raj");
		v.add("kddnfndkfnram");
		v.add("ssd,sdmldmsmmsddmmd");
		v.add("abncjcncncjdncjdjd");
		v.add("rasdsdfdfdfj");
		
		Collections.sort(v);
		System.out.println(v);
//		Iterator<String>it=v.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		boolean b=v.isEmpty();
		System.out.println(b);
		Set<String>s=new HashSet<>(v);
		System.out.println(s);
		
		
	}

}
