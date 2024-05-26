package oopsConcept;

public class EncapsulatePerson {
	private String name;
	private int age;
	public EncapsulatePerson(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "EncapsulatePerson [name=" + name + ", age=" + age + "]";
	}
	

}
