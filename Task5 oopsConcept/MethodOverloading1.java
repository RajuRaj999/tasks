package oopsConcept;

public class MethodOverloading1 {
	    
	    public void display(int age, String name) {
	    	System.out.println("name="+name);
	        System.out.println("age="+age);
	    }

	 
	    public void display(int a, int b) {
	    	int c=a+b;
	        System.out.println("c="+c);
	    }

	    public static void main(String[] args) {
	    	MethodOverloading1 obj = new MethodOverloading1();
	        obj.display(20,"raju");
	        obj.display(10, 20);
	    }
	}



