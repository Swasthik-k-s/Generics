package com.generics;

public class MaxNumber {

	//Method to find the maximum value taking 3 parameters
	public <T extends Comparable<T>> void findMax(T a,T b,T c) {
		T max = a;
		if(b.compareTo(max)>0) {
			max = b;
		}
		if(c.compareTo(max)>0) {
			max = c;
		}
		System.out.println("Maximum of (" + a + "," + b + "," + c + ") = " + max);
	}
}
