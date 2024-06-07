package exam;
import java.util.*;
public class Exampl {
	public static void main(String[] args) {
		Integer arr[]= {9,10,2,2,3,3,4,5,6,1,2,5,2};
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(list);
		System.out.println(list);
		
		Set<Integer>s=new HashSet<Integer>(list);
		System.out.println(s);
	}

}
