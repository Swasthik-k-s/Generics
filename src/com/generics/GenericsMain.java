package com.generics;

public class GenericsMain {

	//Instance Variables
	static Integer a1 = 20, b1 = 52, c1 = 49;
	static Float a2 = 93.f, b2 = 43.9f, c2 = 23f;
	static String a3 = "Generic", b3 = "Maximum", c3 = "Problem";
	
	public static void main(String[] args) {
		
		//Creating 3 objects to find the maximum for Integer, Float and String
		MaxNumber<Integer> max1 = new MaxNumber<>(a1,b1,c1);
		MaxNumber<Float> max2 = new MaxNumber<>(a2,b2,c2);
		MaxNumber<String> max3 = new MaxNumber<>(a3,b3,c3);
		
		//Calling findMax method the find the maximum value
		max1.findMax();
		max2.findMax();
		max3.findMax();
	}

}
