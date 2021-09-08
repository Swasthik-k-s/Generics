package com.generics;

public class MaxNumber {
		private Float a,b,c;

		public MaxNumber(Float a, Float b, Float c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public void findMax() {
			Float max = a;
			if(b.compareTo(max)>0) {
				max = b;
			}
			if(c.compareTo(max)>0) {
				max = c;
			}
			System.out.println("Maximum of (" + a + "," + b + "," + c + ") = " + max);
		}
}
