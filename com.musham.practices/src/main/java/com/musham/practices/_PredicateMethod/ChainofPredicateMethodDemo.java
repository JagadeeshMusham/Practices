package com.musham.practices._PredicateMethod;

import java.util.function.Predicate;

/**
 * @author jmusham
 *
 */
public class ChainofPredicateMethodDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int iArray[] = { 0, 5, 10, 20, 22, 34, 45 };
		Predicate<Integer> predicate1 = num -> num % 2 == 0;
		Predicate<Integer> predicate2 = num -> num > 15;

		// and(), or(), negate()

		System.out.println("The numbers which are Even and greater than 15 are:");

		for (int num : iArray) {
			if (predicate1.and(predicate2).test(num)) {
				System.out.println(num);
			}
		}
	}
}
