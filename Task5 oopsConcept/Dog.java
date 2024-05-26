package oopsConcept;

public class Dog extends Animal{
	public void see() {
		System.out.println("yes i can see everything");
	}
	@Override
	public void hear() {
		System.out.println("yes i am child i can hear the sounds");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.walk();
		d.eat();
		d.see();
		d.hear();
	}

}
