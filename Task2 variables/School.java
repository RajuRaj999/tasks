package Variables;

public class School {
	
	    public static void main(String[] args) {
	        // Creating student instances
	        Student student1 = new Student("raju", 10);
	        Student student2 = new Student("sai", 11);
	        Student student3 = new Student("yuraj", 12);

	        // Displaying student details
	        student1.displayStudentDetails();
	        student2.displayStudentDetails();
	        student3.displayStudentDetails();

	        // Displaying the total number of students
	        System.out.println("Total number of students: " + Student.getStudentCount());
	    }
	}



