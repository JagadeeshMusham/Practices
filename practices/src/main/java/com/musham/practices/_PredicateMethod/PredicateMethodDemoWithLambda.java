package com.musham.practices._PredicateMethod;

import java.util.function.Predicate;

/**
 * @author jmusham
 *
 */
public class PredicateMethodDemoWithLambda {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = num -> num%2 == 0;
		
		System.out.println(predicate.test(10));	
		System.out.println(predicate.test(5));
	}
}
