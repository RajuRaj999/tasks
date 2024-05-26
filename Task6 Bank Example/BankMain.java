package oopsConcept;

public class BankMain {
	public static void main(String[] args) {
		BankAccount b=new BankAccount("Ba9999", 0);
		b.deposit(1000);
		System.out.println("After deposit:"+b);
		b.withdraw(999);
		System.out.println("after withdraw:"+b);
	}

}
