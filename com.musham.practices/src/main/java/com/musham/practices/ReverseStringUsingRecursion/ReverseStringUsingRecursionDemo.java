package com.musham.practices.ReverseStringUsingRecursion;

import java.util.ArrayList;
import java.util.List;


public class ReverseStringUsingRecursionDemo {

	public static void main(String[] args) {
		String str = "abc";
		String reverseString = reverseStringUsingMethod1(str);

		System.out.println("Using reverseStringUsingMethod1, The reverse of the string is: " + reverseString);

		reverseString = reverseStringUsingMethod2(str);

		System.out.println("Using reverseStringUsingMethod2, The reverse of the string is: " + reverseString);

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		// List<Integer> reverseList = reverseList(list);
		// for (int counter : reverseList) {
		// System.out.print(counter);
		// }
	}

	private static String reverseStringUsingMethod1(String input) {
		if (input.isEmpty())
			return input;
		return reverseStringUsingMethod2(input.substring(1)) + input.charAt(0);
	}

	private static String reverseStringUsingMethod2(String str) {
		if (str.length() == 1) {
			return str;
		}

		return str.charAt(str.length() - 1) + reverseStringUsingMethod2(str.substring(0, str.length() - 1));
	}

	
	//Unused Code
	private List<Integer> reverseList(List<Integer> list) {
		if (list.size() == 1) {
			return list;
		}

		// return list.get(list.size() - 1);

		return null;
	}

}
