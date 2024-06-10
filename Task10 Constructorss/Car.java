package Constructorss;

public class Car {
	
	  
	    private String make;
	    private String model;
	    private int year;

	    // Parameterized constructor
	    public Car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	   
	    public void displayCarDetails() {
	        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	    }

	    
	    public static void main(String[] args) {

	        Car car1 = new Car("Toyota", "Camry", 2020);
	        Car car2 = new Car("Honda", "Accord", 2019);

	        
	        car1.displayCarDetails(); 
	        car2.displayCarDetails(); 
	    }
	}



