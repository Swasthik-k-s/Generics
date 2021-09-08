package com.generics;

public class GenericsMain {

	public static void main(String[] args) {
		MaxNumber max1 = new MaxNumber("this","is","a");
		MaxNumber max2 = new MaxNumber("only","method","for");
		MaxNumber max3 = new MaxNumber("genric","maximum","problem");
		
		max1.findMax();
		max2.findMax();
		max3.findMax();
	}

}
