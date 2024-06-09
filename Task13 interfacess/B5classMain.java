package interfacess;

public class B5classMain {

	public static void main(String[] args) {
		
		B4class b=new B4class();
		b.BB();
		b.BC();//all methods are available
		b.BD();
		B2 bc=new B4class();
		bc.BC();//only b2 methods are available
		

	}

}
