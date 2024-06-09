package interfacess;

public interface InterAtm {
	public void withdraw();
}

class Bank {
	private class Sbi implements InterAtm {
		@Override
		public void withdraw() {
			System.out.println("it is withdraw");
		}
	}

	public InterAtm atm() {//helper method
		System.out.println("it is a atm method");
		return new Sbi();//upcasting
	}
}
