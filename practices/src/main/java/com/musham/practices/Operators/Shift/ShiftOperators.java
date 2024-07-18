package com.musham.practices.Operators.Shift;

public class ShiftOperators {
	public static void main(String [] args) {
		int a = 512;
		System.out.println("The original value: " + a);
		
		System.out.println("The Shift operator with '1'");
		System.out.println("Shift right value:" + (a>>1));
		System.out.println("Shift right value with zeros:" + (a>>>1));
		System.out.println("Shift left value:" + (a<<1));

	
		System.out.println("\n\nThe original value: " + a);
		System.out.println("The Shift operator with '2'");
		System.out.println("Shift right value:" + (a>>2));
		System.out.println("Shift right value with zeros:" + (a>>>2));
		System.out.println("Shift left value:" + (a<<2));
	}
}
