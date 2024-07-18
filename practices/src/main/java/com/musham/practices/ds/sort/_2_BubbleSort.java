package com.musham.practices.ds.sort;

import java.util.Scanner;

/**
 * @author jmusham
 *
 */

/*
 * Best Case: O(n) (already sorted)
 * Average Case: O(n2)
 * Worst Case: O(n2)
 */
public class _2_BubbleSort {
	
	/**
	 * The algorithm for Bubble sort is:
	 * 
	 * My Explanation on 18th July, 2024:
	 * Pick first value compare with second value
	 * 		if the second value is lesser then swap
	 * 		else pick second value
	 * 		and compare current value with next value
	 * 		continue until the last value
	 * 		after this iteration the greater value will be in the last cell(its like bubble).
	 * 
	 * In this process, 
	 * 		first iteration will include all(n) values to compare
	 * 		Second iteration will include n-1 values to compare
	 * 		continue until it reaches to sorted array.
	 * 
	 * Following will explain more clearly:
To sort below
5 3 9 2 7 6 1 4

Following are the steps:
iteration 1:
  3 5 9 2 7 6 1 4
  3 5 2 9 7 6 1 4
  3 5 2 7 9 6 1 4
  3 5 2 7 6 9 1 4
  3 5 2 7 6 1 9 4
  3 5 2 7 6 1 4 9

Iteration 2:
  3 5 2 7 6 1 4 9
  3 2 5 7 6 1 4 9
  3 2 5 6 7 1 4 9
  3 2 5 6 1 7 4 9
  3 2 5 6 1 4 7 9

Iteration 3:
  2 3 5 6 1 4 7 9
  2 3 5 1 6 4 7 9
  2 3 5 1 4 6 7 9

Iteration 4:
  2 3 1 5 4 6 7 9
  2 3 1 4 5 6 7 9

Iteration 5:
  2 3 1 4 5 6 7 9

Iteration 6:
  2 1 3 4 5 6 7 9

Iteration 7:
  1 2 3 4 5 6 7 9

	 * 
	 * 
	 * General Explanation:
	 * Start with an unsorted array of elements.
	 * Repeat steps 3-5 for 𝑖=0 n−1, where n is the number of elements in the array.
	 * Repeat steps 4-5 for j=0 to n−i−1.
	 * Compare the jth and (j+1)th elements of the array.
	 * If the jth element is greater than the (j+1)th element, swap them.
	 * Continue until no more swaps are needed. At this point, the array is sorted.
	 * 
	 * 
	 * The Pseudocode is:
	 * procedure bubbleSort(A : list of sortable items)
	 *     n = length(A)
	 *     repeat (step 2) for i = 0 to n-1
	 *     		repeat (step 3) for j = 0 to n-i-1
	 *          	if A[j] > A[j+1] then
	 *              	swap(A[j], A[j+1])
	 *              end if
	 *          end repeat
	 *     end repeat
	 * end procedure
	 * 
	 * 
	 * The sorting order will be as follows
	 * 
	 * 34 12 54 1 6
	 * 12 34 1 6 54
	 * 12 1 6 34 54
	 * 1 6 12 34 54 
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of integers to be sorted");
		int count = scanner.nextInt();

		int values[] = new int[count];
		for (int counter = 0; counter < count; counter++) {
			System.out.println("Enter the number for" + counter + "position: ");
			values[counter] = scanner.nextInt();
		}

		System.out.println("The unsorted array is: ");
		printArray(values);
		
		doSort(values);

		System.out.println("\nThe sorted array is: ");
		printArray(values);
	}

	/**
	 * @param values
	 */
	private static void doSort(int[] values) {
		for (int firstCounter = 0; firstCounter < values.length; firstCounter++) {
			for (int counter = 0; counter < values.length - 1 - firstCounter; counter++) {
				if (values[counter] > values[counter + 1]) {
					int temp = values[counter];
					values[counter] = values[counter + 1];
					values[counter + 1] = temp;
				}
				
				System.out.println("\n The Array after " + (counter+1) + " internal iteration\n");
				printArray(values);
			}
			
			System.out.println("\n \t\tThe Array after " + (firstCounter+1) + " iteration\n");
			printArray(values);
		}
	}
	
	/**
	 * @param a
	 * @param count
	 */
	private static void printArray(int [] values) {
		for (int counter = 0 ; counter < values.length; counter++) {
			System.out.print(values[counter] + " ");
		}

	}
}
