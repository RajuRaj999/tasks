package oopsConcept;

 class CarModel extends Car{
	 public static void run() {
		 System.out.println("yes i am car");
	 }
	 public static void main(String[] args) {
		Car c=new CarModel();
		c.name="lambargini";
		c.model="Hurcan Evo";
		c.price=3232653214l;
		run();
		System.out.println(c);
		
	}
	
	

}
