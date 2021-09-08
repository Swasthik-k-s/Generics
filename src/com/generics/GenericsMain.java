package com.generics;

public class GenericsMain {

	public static void main(String[] args) {
		MaxNumber max1 = new MaxNumber(57,14,36);
		MaxNumber max2 = new MaxNumber(17,84,4);
		MaxNumber max3 = new MaxNumber(47,18,790);
		
		max1.findMax();
		max2.findMax();
		max3.findMax();
	}

}
