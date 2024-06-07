package exam;

import java.util.Arrays;

public class BubleSort {
	public static void main(String[] args) {
		int a[]= {2,7,4,8,34};
		int n=a.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			//System.out.println(a[i]);
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		}

}
