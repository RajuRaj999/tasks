package oopsConcept;

public class BankAccount{
	private String accountNumber;
	private double balance;
	public BankAccount(String accountNumber, double balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {

		if(getBalance()+amount<100) {
			System.out.println("minimum balance is 100 rs required");
		}
		else {
			balance+=amount;
		}
		 
		
	}
	public void withdraw(double amount) {
		if(getBalance()<amount) {
			System.out.println("insufficient balance in your account");
			 
		}
		else if(getBalance()-amount<100) {
			System.out.println("minimum balance is 100 rs required");
			 
		}
		 else if  (getBalance()>=amount) {
				balance-=amount;
				
			}
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
}
	
	