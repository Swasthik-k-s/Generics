package com.generics;

public class GenericsMain {

	//Instance Variables
	static Integer a1 = 20, b1 = 52, c1 = 49, d1 = 72;
	static Float a2 = 93.f, b2 = 43.9f, c2 = 23f, d2 = 82f, e2 = 12f;
	static String a3 = "Generic", b3 = "Maximum", c3 = "Problem";
	
	public static void main(String[] args) {
		
		//Creating 3 objects to find the maximum for Integer, Float and String
		MaxNumber<Integer> max1 = new MaxNumber<>();
		MaxNumber<Float> max2 = new MaxNumber<>();
		MaxNumber<String> max3 = new MaxNumber<>();
		
		//Calling findMax method the find the maximum value
		max1.testMaximum(a1,b1,c1,d1);
		max2.testMaximum(a2,b2,c2,d2,e2);
		max3.testMaximum(a3,b3,c3);
	}

}
