package com.musham.practices.ds.sort;

import java.util.Scanner;

/**
 * @author jmusham
 *
 */
public class _2_SelectionSort {
	/**
	 * The algorithm for selection sort:
	 * 
	 * 1.Start with an unsorted array of elements.
	 * 2.Repeat steps 3-5 for i=0 to n−1, where n is the number of elements in the array.
	 * 3.Set the minimum index to i.
	 * 4.Repeat steps 5-6 for j=i+1 to n−1.
	 * 5.If the element at index j is less than the element at the minimum index, update the minimum index to j.
	 * 6.Swap the element at index i with the element at the minimum index.
	 * 7.Continue until the entire array is sorted.
	 * 
	 * 
	 * The Pseudo code is:
	 * 
	 * procedure selectionSort(A : list of sortable items)
	 *     n = length(A)
	 *     repeat (step 2) for i = 0 to n-1
	 *         minIndex = i
	 *         repeat (step 4) for j = i+1 to n-1
	 *             if A[j] < A[minIndex] then
	 *                 minIndex = j
	 *             end if
	 *         end repeat
	 *         swap(A[i], A[minIndex])
	 *     end repeat
	 * end procedure
	 * 
	 * 
	 * 
	 * The sorting format will be as follows
	 * 
	 * 34 12 54 01 06
	 * 		12 34 54 01 06
	 *  	01 34 54 12 06
	 *  01 34 54 12 06
	 *  	01 12 54 34 06
	 *  	01 06 54 34 12
	 *  01 06 54 34 12
	 *  	01 06 34 54 12
	 *  	01 06 12 54 34
	 *  01 06 12 54 34
	 *  	01 06 12 34 54
	 *  01 06 12 34 54
	 */
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of integer to sort");
		int totalNumbers = scanner.nextInt();

		int values[] = new int[totalNumbers];
		
		for (int counter = 0; counter < totalNumbers; counter++) {
			values[counter] = scanner.nextInt();
		}

		System.out.println("The values in the array: ");
		printArray(values);
		doSelectionSort(values);

		System.out.println();
		printArray(values);
	}

	/**
	 * @param values
	 */
	private static void doSelectionSort(int[] values) {
		for (int counter = 0; counter < values.length; counter++) {
			for (int subCounter = counter; subCounter < values.length; subCounter++) {
				if (values[counter] > values[subCounter]) {
					swapValues(values, counter, subCounter);
				}
				System.out.println("\n The Array after " + (subCounter+1) + " internal iteration\n");
				printArray(values);
			}
			
			System.out.println("\n The Array after " + (counter+1) + " iteration\n");
			printArray(values);
		}
	}

	/**
	 * @param values
	 * @param counter
	 * @param subCounter
	 */
	private static void swapValues(int[] values, int counter, int subCounter) {
		int tempValue = values[counter];
		values[counter] = values[subCounter];
		values[subCounter] = tempValue;
	}

	/**
	 * @param values
	 */
	private static void printArray(int[] values) {
		for (int counter = 0; counter < values.length; counter++) {
			System.out.print(values[counter] + " ");
		}
		System.out.println();
	}

}
