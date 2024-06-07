package exam;

public class Palendrome {
	public static void main(String[] args) {
		int n=132;
		int m,rev=0,r;
		m=n;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		if(rev==m) {
			System.out.println("palendrome number");
		}
		else {
			System.out.println("it is not palendrome number");
		}
	}

}
