import java.io.*;
public class UnaryOperator {
	public static void main(String[] args) {
		int a=129;
		int b=32;
		boolean c=true;  
		boolean d=false;  
		System.out.println(+a);//129
		System.out.println(-b);//-32
		System.out.println(++b);//33
		System.out.println(a--);//129
		System.out.println(b++);//33
		System.out.println(++a + ++a);//259
		System.out.println(~a);// -131
		System.out.println(~b);//  -35
		System.out.println(!c);//false
		System.out.println(!d);//true
	}

}