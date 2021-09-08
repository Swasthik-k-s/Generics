package com.generics;

public class MaxNumber<T extends Comparable<T>> {

	private T a,b,c;
	
	public MaxNumber(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Method used to call generic method from main
	public void findMax() {
		testMaximum(a,b,c);
	}
	
	//Method to find the maximum value taking 3 parameters
	public <T extends Comparable<T>> void testMaximum(T a,T b,T c) {
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
