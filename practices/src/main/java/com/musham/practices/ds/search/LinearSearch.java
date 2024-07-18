package com.musham.practices.ds.search;

/*
 * Best Case: O(1)
 * Average Case: O(n)
 * Worst Case: O(n)
 */

public class LinearSearch {
	// Function to perform linear search
	public static int linearSearch(int[] arr, int key) {
		// Iterate through the array to find the key
		for (int i = 0; i < arr.length; i++) {
			// If key is found, return its index
			if (arr[i] == key) {
				return i;
			}
		}
		// If key is not found, return -1
		return -1;
	}

	public static void main(String[] args) {
		// Test array
		int[] arr = { 12, 45, 7, 23, 56, 89, 3, 9 };
		// Key to search
		int key = 23;
		// Perform linear search
		int index = linearSearch(arr, key);
		// Check if key is found
		if (index != -1) {
			System.out.println("Element " + key + " found at position " + (index+1));
		} else {
			System.out.println("Element " + key + " not found in the array");
		}
	}
}
