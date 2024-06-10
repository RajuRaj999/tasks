package Arrayss;

public class Array1 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };

		System.out.println("Element at index 2: " + numbers[2]);

		numbers[3] = 10;

		System.out.print("Array elements: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Element at row 1, column 2: " + matrix[1][2]);
	}
}
