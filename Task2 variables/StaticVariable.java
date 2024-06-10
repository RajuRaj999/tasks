package Variables;

public class StaticVariable {
	
	    // Static variable
	    static int counter = 0;

	    // Constructor to increment the counter
	    public StaticVariable() {
	        counter++;
	    }

	    // Method to display the value of the counter
	    public void displayCounter() {
	        System.out.println("Counter: " + counter);
	    }

	    public static void main(String[] args) {
	        // Creating instances of StaticVariables class
	        StaticVariable obj1 = new StaticVariable();
	        StaticVariable obj2 = new StaticVariable();
	        StaticVariable obj3 = new StaticVariable();

	        // Displaying the counter value using different objects
	        obj1.displayCounter(); // Output: Counter: 3
	        obj2.displayCounter(); // Output: Counter: 3
	        obj3.displayCounter(); // Output: Counter: 3
	    }
	}



