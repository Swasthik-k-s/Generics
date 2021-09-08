package com.generics;

public class GenericsMain {

	public static void main(String[] args) {
		MaxNumber max1 = new MaxNumber(57f,14f,36f);
		MaxNumber max2 = new MaxNumber(17f,84f,4f);
		MaxNumber max3 = new MaxNumber(47f,18f,790f);
		
		max1.findMax();
		max2.findMax();
		max3.findMax();
	}

}
