package interfacess;

public class UserInter {
	public static void main(String[] args) {
		Bank b=new Bank();
		InterAtm a=b.atm();
		a.withdraw();
	}
}
