package com.generics;

import java.util.*;

public class MaxNumber<T extends Comparable<T>> {

	//Method to find the maximum value taking n parameters
	public <T extends Comparable<T>> void testMaximum(T... value) {
		List<T> array = new ArrayList<T>();
		
		for(T item: value) {
			array.add(item);
		}
		array.sort(null);
		
		T max = array.get(array.size()-1);
		printMax(max);
	}
	
	public <T> void printMax(T max) {
		System.out.println("Maximum = " + max);
	}
}
