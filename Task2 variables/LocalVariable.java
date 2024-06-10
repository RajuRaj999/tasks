package Variables;

public class LocalVariable {

	    public static void main(String[] args) {
	        // Local variables declared inside the main method
	        int num1 = 10;
	        int num2 = 20;
	        int sum = add(num1, num2); // Calling the add method with local variables

	        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	    }

	    // Method to add two numbers
	    public static int add(int a, int b) {
	        // Local variables declared inside the add method
	        int result = a + b;
	        return result;
	    }
	}



