package jumpingstatements;

public class BreakStatement {
	public static void main(String[] args) {
		int i = 3;
		switch (i) {
		case 1:
			System.out.println("case 1");
		case 2:
			System.out.println("case 2");
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");

		case 5:
			System.out.println("case 5");
			break;

		case 6:
			System.out.println("case 6");

		default:
			System.out.println("yes iam switch statement");

		}

	}

}
