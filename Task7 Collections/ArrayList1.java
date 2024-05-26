package collections;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> items=new ArrayList<>();
		//Adding elements
		items.add("Apple");
		items.add("Mango");
		items.add("Bananna");
		items.add("Grapes");
		items.add("Orange");
		items.add("watermelon");
		items.add("Orange");
		items.add("Orange");
		System.out.println(items);
		//removing element
		items.remove(0);
		items.remove(3);
		System.out.println(items);
		//BinarySearch
		System.out.println(Collections.binarySearch(items, "Grapes"));
		//updating an element
		items.set(0, "Strawberry");
		items.set(2,  "Papaya");
		System.out.println(items);
		//Add all elements
		Collections.addAll(items,"Kiwi", "Blueberry","Gooseberry","Olive", "Tangerine");
		System.out.println(items);
		//size of an arraylist
		int a=items.size();
		System.out.println(a);
		//is empty method
		boolean b=items.isEmpty();
		System.out.println(b);
		//sort
		Collections.sort(items);
		System.out.println(items);
		//reverse method
		Collections.reverse(items);
		System.out.println(items);
		
		
	}
	

}
