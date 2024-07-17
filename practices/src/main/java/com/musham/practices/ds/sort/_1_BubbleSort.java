package com.musham.practices.ds.sort;

import java.util.Scanner;

/**
 * @author jmusham
 *
 */
public class _1_BubbleSort {
	
	/**
	 * The algorithm for Bubble sort is:
	 * 
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
