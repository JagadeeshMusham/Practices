package com.musham.practices._PredicateMethod;

/**
 * @author jmusham
 *
 */
public class PredicateMethodDemo {
	/**
	 * @param num
	 * @return
	 */
	public static Boolean isEven(int num)
	{
		if (num%2 == 0)
		{
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isEven(10));
		System.out.println(isEven(5));
	}

}