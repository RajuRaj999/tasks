package questions;

//1. Find a peak element which is not smaller than its neighbours
//
//EX:
//
//Given an array arr of n elements that is first strictly increasing
//and then maybe strictly decreasing, find the maximum element in the array.
//
//Note: if the array is increasing then just print the last 
//element will be the maximum value.

public class Question1 {
	public static void main(String[] args) {
		int arr[]={9,4,7,12,89,2};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			if(arr[0]<arr[i]) {
			 arr[0]=arr[i];
		
			}
			 
		}
		System.out.println("peak value of array is= "+arr[0]);
	}
	

}
