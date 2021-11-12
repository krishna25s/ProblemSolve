package com.java.problem;
/**
 * Problem2: Add two linked list given in reverse order and print result
 * Algorithm: 1) Initialize two linked list in reverse order
 * 2) Initialize third linked list where have to save result
 * 3) add element in ll1 and ll2
 * 4) add ll1 and ll2
 * 5) save the result in temporary array
 * 6) copy sum result in linked list from temporary array in reverse order. So we get desired result
 */

import java.util.LinkedList;

public class SumOfTwoLLinReverseOrder {
	//int Input1=5468;
	//int Input2=3457;
    
	public void addTwoLL() {
		LinkedList<Integer> ll1= new LinkedList<Integer>();
		LinkedList<Integer> ll2=new LinkedList<Integer>();
		LinkedList<Integer> ll3=new LinkedList<Integer>();
		int arr[]=new int[5];
		ll1.add(8);
		ll1.add(6);
		ll1.add(4);
		ll1.add(5);
		ll2.add(7);
		ll2.add(5);
		ll2.add(4);
		ll2.add(3);
		System.out.println(ll1);
		System.out.println(ll2);
		int i=ll1.size();
		
			  for(int k=0;k<=i-1;k++) {
				    int remainder=(ll1.get(k)+ll2.get(k))%10;
			  			if(k==0) {
			  		   		//ll3.add(remainder);
			  		   		arr[k]=remainder;
			  		   	   } else {
			  		   		int carry=(ll1.get(k-1)+ll2.get(k-1))/10;
			  		   		//ll3.add(remainder+carry);
			  		   		arr[k]=remainder+carry;
			  		   	   }	  
			   } 
			  for (int p=i-1; p>=0;p--) {
				  ll3.add(arr[p]);
			  }
      System.out.println(ll3);
	}
	
	public static void main(String args[]) {
		
		  SumOfTwoLLinReverseOrder addLL= new SumOfTwoLLinReverseOrder();
		  addLL.addTwoLL();	
	}
    
}
