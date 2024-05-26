package collections;

import java.util.Iterator;
import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		//push method adding  elements to the list
		s.push(1);
		s.push(12);
		s.push(15);
		s.push(14);
		s.push(22);
		s.push(0);
		s.push(14);
		s.push(13);
		Iterator<Integer>it=s.iterator();
		while(it.hasNext()) {
			int a=it.next();
		System.out.println(a);
	}
		//pop method :removing an element (last in first out)
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);
		
		//peek value
		int b=s.peek();
		System.out.println(b);
		
//		search
		int d=s.search(14);
		System.out.println(d);
		//size
		int r=s.size();
		System.out.println(r);
		}

}
