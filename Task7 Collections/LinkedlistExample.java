package collections;
import java.util.*;  
public class LinkedlistExample {
	 
	 public static void main(String args[]){  
	  //adding
	  LinkedList<String> a=new LinkedList<String>();  
	  a.add("raju");  
	  a.add("ravi");  
	  a.add("sai");  
	  a.add("yuvraj");  
	  
	  Iterator<String> itr=a.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  } 
	  //removing element
	  a.remove("sai");
	  System.out.println(a);
	  //size method
	  int s=a.size();
	  System.out.println(s);
	  //empty method
	  boolean b=a.isEmpty();
	  System.out.println(b);
	  //removing by index
	  a.remove(0);
	  System.out.println(a);
	  
	 }  
	}



