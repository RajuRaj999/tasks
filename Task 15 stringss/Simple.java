package stringss;

import java.util.StringTokenizer;

public class Simple {
	public static void main(String[] args) {
		String data="this, is, my, computer";
		StringTokenizer tokenizer=new StringTokenizer(data, ",");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken().trim());
		}
	}
	

}
