package exam;

import java.time.LocalTime;

public class MainMethod1 {
	public static void main(String[] args) {
		Airplane flight1=new Airplane("A1235","newyork",LocalTime.of(10, 30));
		Airplane flight2=new Airplane("B1235","London",LocalTime.of(20, 30));
		Airplane flight3=new Airplane("C1235","Paris",LocalTime.of(13, 30));
		Airplane flight4=new Airplane("D1235","USA",LocalTime.of(14, 30));
		Airplane flight5=new Airplane("E1235","Australia",LocalTime.of(11, 30));
		System.out.println("flight status:");
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
		flight4.checkStatus();
		flight5.checkStatus();
		flight1.delay(10);
		flight2.delay(20);
		System.out.println("\ncurrent flight Status");
		flight1.checkStatus();
		flight2.checkStatus();
		
		
	}

}
