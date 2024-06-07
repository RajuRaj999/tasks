package exam;

import java.util.Scanner;

public class PalendromeScsnner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m,rev=0,r;
		m=n;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(m==rev) {
			System.out.println(m+"is a palendrome number");
		}
		else {
			System.out.println(m+"is not a palendrome");
		}
	}

}
