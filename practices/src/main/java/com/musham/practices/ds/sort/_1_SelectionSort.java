package com.musham.practices.ds.sort;

import java.util.Scanner;

/**
 * @author jmusham
 *
 */

/*
 * This is very basic sorting
 * Best Case: O(n2)
 * Average Case: O(n2)
 * Worst Case: O(n2)
 */
public class _1_SelectionSort {
	/**
	 * The algorithm for selection sort:
	 * 
	 * My Explanation on 18th July, 2024:
	 * In selection sort, the sorting will be done on the cell. 
	 * i.e., at the first iteration low value will be available at first cell.
	 * The process will be as follows:
	 * 
	 * Pick first cell(i.e., 0 position),
	 * 		Compare with next cell (i.e., 1st position)
	 * 			if the first value is greater than next, then swap
	 * 			else do nothing
	 * 		Compare first cell with next position(i.e., 2nd position)
	 * 		repeat until it reaches entire digits.
	 * 		after completion of first iteration least value will be available in the first cell.
	 * Pick the next cell(i.e., 1st position), perform until last cell
	 * Repeat this until last cell.
	 * Final result will be in sorted array
	 * 
	 * Following explain more clearly
To sort below
5 3 9 2 7 6 1 4

Following are the steps:
  3 5 9 2 7 6 1 4
  2 5 9 3 7 6 1 4
  1 5 9 3 7 6 2 4

  1 3 9 5 7 6 2 4
  1 2 9 5 7 6 3 4
  
  1 2 5 9 7 6 3 4
  1 2 3 9 7 6 5 4
  
  1 2 3 7 9 6 5 4
  1 2 3 6 9 7 5 4
  1 2 3 5 9 7 6 4
  1 2 3 4 9 7 6 5

  1 2 3 4 7 9 6 5
  1 2 3 4 6 9 7 5
  1 2 3 4 5 9 7 6

  1 2 3 4 5 7 9 6
  1 2 3 4 5 6 9 7

  1 2 3 4 5 6 7 9
	 * 
	 * 
	 * General Explanation:
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
	 * The sorting order will be as follows
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
