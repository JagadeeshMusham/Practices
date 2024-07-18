package com.musham.practices.InterviewQuestions;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit 
 * integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * 
 * 
 * Example 1:
 * Input: x = 123
 * Output: 321
 * Example 2:
 * Input: x = -123
 * Output: -0
 * Example 3:
 * Input: x = 120
 * Output: 21
 */

public class Arrise_08May2024 {

	public static void main(String[] args) {

		int num = -122;

		System.out.println("The Input is : " + num);

		boolean bNegative = false;
		if (num < 0) {
			bNegative = true;
			
			// or we can use Math.abs method also to remove sign values
			num *= -1;
		}
		

		int reverse = 0;

		while (num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num = num / 10;
		}

		System.out.print("The Output is: ");
		if (reverse <= -231 || reverse >= 230) {
			System.out.println(0);
		} else {
			if (bNegative)
				reverse *= -1;
			System.out.print(reverse);
		}
	}
}
