package FinalKeyworda;

public class FinallyKeyword1 {
	public static void main(String[] args) {
		try {

			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
		} 
		finally {
			// Code that will always be executed
			System.out.println("The finally block is always executed.");
		}

		System.out.println("Program continues after the try-catch-finally block.");
	}
}
