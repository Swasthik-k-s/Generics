package com.generics;

public class GenericsMain {

	public static void main(String[] args) {
		
		//Creating 3 objects to find the maximum for Integer, Float and String
		MaxNumber max1 = new MaxNumber();
		MaxNumber max2 = new MaxNumber();
		MaxNumber max3 = new MaxNumber();
		
		//Calling findMax method the find the maximum value
		max1.findMax(20,523,82);
		max2.findMax(93f,43.9f,23f);
		max3.findMax("genric","maximum","problem");
	}

}
