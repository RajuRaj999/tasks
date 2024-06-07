package oopsConcept;

public class MethodOverridingMain {
	public static void main(String[] args) {
		MethodOverriding1 obj=new MethodOverriding1();
		obj.behaves();
		obj.parent();
		MethodOverriding2 obj2=new MethodOverriding2();
		obj2.behaves();
		obj2.parent();
		obj2.play();
		
	}

}
