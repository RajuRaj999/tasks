package interfacess;

public interface A1 {
	public void band();

}

class A2 implements A1{

	@Override
	public void band() {
		System.out.println("A2");
		// TODO Auto-generated method stub
		
		
	}
	public void band(int a,int b) {
		System.out.println("rajuuuu");
	}
	public void eat() {
		System.out.println("eat A2");
	}
	
}
class A3 implements A1{

	@Override
	public void band() {
		System.out.println("A3");
		// TODO Auto-generated method stub
		
	}
	public void see() {
		System.out.println("see A3");
	}
	
} 
class A4 extends A2  implements A1,Aaaa{

	@Override
	public void AA() {
		System.out.println("AA");
		// TODO Auto-generated method stub
		
	}
	public void band() {
		System.out.println("band");
		
	}
	public void eat() {
		System.out.println("ate a2");
	}
	public void walk() {
		System.out.println("walk");
	}
	
}
