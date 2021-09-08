package com.generics;

public class MaxNumber {
		private String a,b,c;

		public MaxNumber(String a, String b, String c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public void findMax() {
			String max = a;
			if(b.compareTo(max)>0) {
				max = b;
			}
			if(c.compareTo(max)>0) {
				max = c;
			}
			System.out.println("Maximum of (" + a + "," + b + "," + c + ") = " + max);
		}
}
