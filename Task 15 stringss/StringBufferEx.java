package stringss;

public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer("Hello");

		stringBuffer.append(" World");

//		stringBuffer.insert(5, ", Java");
//
//		stringBuffer.delete(5, 10);
//
//		stringBuffer.replace(5, 10, "Java");

		System.out.println("Final StringBuffer: " + stringBuffer.toString());
	}
}
