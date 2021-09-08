package com.generics;

public class MaxNumber {
		private Integer a,b,c;

		public MaxNumber(Integer a, Integer b, Integer c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public void findMax() {
			Integer max = a;
			if(b.compareTo(max)>0) {
				max = b;
			}
			if(c.compareTo(max)>0) {
				max = c;
			}
			System.out.println("Maximum of (" + a + "," + b + "," + c + ") = " + max);
		}
}
