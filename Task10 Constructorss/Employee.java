package Constructorss;

public class Employee {
	    int id;
	    String name;
	    
	    public Employee(int id, String name){
	        this.id=id;
	        this.name=name;
	    }
	    void display(){
	        System.out.println(id + " " + name);
	    }
	    
	    public static void main (String[] args) {
	    	Employee e1 = new Employee(101, "raju");
	    	Employee e2 = new Employee(103, "sai krishna");
	        e1.display();
	        e2.display();
	    }
	}


