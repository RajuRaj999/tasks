package Variables;

public class Student {
	
	    // Static variable to keep track of the number of students
	    private static int studentCount = 0;

	    // Instance variables
	    private String name;
	    private int grade;

	    // Constructor to initialize student name and grade
	    public Student(String name, int grade) {
	        this.name = name;
	        this.grade = grade;
	        studentCount++; // Increment the student count when a new student is created
	    }

	    // Static method to get the current student count
	    public static int getStudentCount() {
	        return studentCount;
	    }

	    // Method to display student details
	    public void displayStudentDetails() {
	        System.out.println("Name: " + name + ", Grade: " + grade);
	    }
	}

	


