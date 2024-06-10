package Constructorss;

public class Person {

	    
	    private String name;
	    private int age;

	    // Default constructor
	    public Person() {
	        name = "raju";
	        age = 25;
	    }

	    
	    public void displayPersonDetails() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	   
	    public static void main(String[] args) {
	      
	        Person person = new Person();
	        
	       
	        person.displayPersonDetails(); 
	    }
	}



