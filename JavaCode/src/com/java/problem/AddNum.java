package com.java.problem;
/**
 * Problem1: Add two number and if value is equal to target return indices
 * 
 * Algorithm:1. Initialize given array
 * 2. Initialize target value
 * 3. Initialize loop and compare value 
 *      a. If sum of value is equal to target return indices
 */


public class AddNum {

	public String addition() {
		int[] arr={7,8,5,6};
		int target= 14;
		for(int i=0; i<=arr.length-2;i++) {
			
			for(int j=1;j<=arr.length-1;j++) {
				
				if(arr[i]+arr[j]==target) {
					System.out.println(i+","+j);
					return i+","+j;
				}
			}
		}
		return null; 
	}
	public static void main(String[] args) {
		AddNum addNum =new AddNum();
		addNum.addition();
	}
}
