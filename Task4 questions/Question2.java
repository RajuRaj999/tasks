package questions;

//2. Sort an array of 0s, 1s and 2s
//
//EX:
//
//Given an array A[] consisting of only 0s, 1s and 2s. The task is to write a 
//function that sorts the given array. The functions should put all 0s, first then 
//all 1s and all 2s in last.

import java.util.ArrayList;
public class Question2 {
	public static void main(String[] args) {
		int arr[]= {0,1,2,1,2,1,2,0,0,0,1};
		int j=1;
		int k=2;
		ArrayList<Integer>ary=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[0]==arr[i]) {
				ary.add(arr[0]);
				
			}
		}
		//System.out.println(ary);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==j) {
				ary.add(j);
				
			}
		}
		//System.out.println(ary);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				ary.add(k);
				
			}
		}
		System.out.println(ary);
		
	}

}
