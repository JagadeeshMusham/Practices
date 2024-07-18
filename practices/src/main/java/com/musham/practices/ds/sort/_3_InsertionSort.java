package com.musham.practices.ds.sort;

import java.util.Scanner;

/*
 * Best Case: O(n) (already sorted)
 * Average Case: O(n2)
 * Worst Case: O(n2)
 */


/*
 * This is an in-place comparison-based sorting algorithm. Here, a sub-list is maintained
 * which is always sorted. For example, the lower part of an array is maintained to be sorted. 
 * An element which is to be 'insert'ed in this sorted sub-list, has to find its appropriate 
 * place and then it has to be inserted there. Hence the name, insertion sort.
 * */

/*
 * Best Case: O(n) (already sorted)
 * Average Case: O(n2)
 * Worst Case: O(n2)
 */
/*
 * Algorithm:
 * 
 * My Explanation on 18th July, 2024
 * select hole position as 1, and the value to temp variable
 * 		Compare temp value with holeposition - 1 value(i.e., 0th position value)
 * 			if (holepos - 1) value is greater than holepos value then copy (holepos - 1) value to holepos value.
 * 			else move for further iteration
 * 		decrease holepos by 1
 * 		continue above steps until holepos reaches to 1.
 * 		Finally put the temp value in the hole position.
 * 
 * pick third value as hole position and repeat above all steps
 * 
 * Below example depicts more clearly
 * ==============Ex Start=======================

To sort below
5 3 9 2 7 6 1 4

Following are the steps:
pick 3 to temp
  5 5 9 2 7 6 1 4
  3 5 9 2 7 6 1 4

9
  3 5 9 2 7 6 1 4

2
  3 5 9 9 7 6 1 4
  3 3 5 9 7 6 1 4
  2 3 5 9 7 6 1 4

7
  2 3 5 9 9 6 1 4
  2 3 5 7 9 6 1 4

6
  2 3 5 7 9 9 1 4
  2 3 5 7 7 9 1 4
  2 3 5 6 7 9 1 4

1
  2 3 5 6 7 9 9 4
  2 3 5 6 7 7 9 4
  2 3 5 6 6 7 9 4
  2 3 5 5 6 7 9 4
  2 3 3 5 6 7 9 4
  2 2 3 5 6 7 9 4
  1 2 3 5 6 7 9 4

4
  1 2 3 5 6 7 9 9
  1 2 3 5 6 7 7 9
  1 2 3 5 6 6 7 9
  1 2 3 5 5 6 7 9
  1 2 3 4 5 6 7 9

 * ==============Ex End=========================
 * 
 * 
 * 
 * General Explanation:
 * Step 1 - If it is the first element, it is already sorted. return 1;
 * Step 2 - Pick next element
 * Step 3 - Compare with all elements in the sorted sub-list
 * Step 4 - Shift all the elements in the sorted sub-list that is greater than the 
 * 			value to be sorted
 * Step 5 - Insert the value
 * Step 6 - Repeat until list is sorted
 * 
 * The Pseudo code is:
 * 
 * procedure insertionSort(A : list of sortable items)
 *     n = length(A)
 *     for i = 1 to n-1
 *         currentElement = A[i]
 *         j = i - 1
 *         while j >= 0 and A[j] > currentElement
 *             A[j + 1] = A[j]
 *             j = j - 1
 *         end while
 *         A[j + 1] = currentElement
 *     end for
 * end procedure
 * 
 * 
 * The sorting order will be as follows
 * 
 * 34 12 54 01 06
 * pick 12
 * 		34 34 54 01 06
 * 		12 34 54 01 06
 * 12 34 54 01 06
 * pick 54
 * 		12 34 54 01 06
 * 12 34 54 01 06
 * pick 01
 * 		12 34 54 54 06
 * 		12 34 34 54 06
 * 		12 12 34 54 06
 * 		01 12 34 54 06
 * 01 12 34 54 06
 * pick 06
 * 		01 12 34 54 54
 * 		01 12 34 34 54
 * 		01 12 12 34 54
 * 		01 06 12 34 54
 * 01 06 12 34 54
 */

public class _3_InsertionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of integers to sort ");
		int totalNumbers = scanner.nextInt();
		int values[] = new int[totalNumbers];

		int counter = 0;
		for (; counter < totalNumbers; counter++) {
			System.out.println("Enter a number: ");
			values[counter] = scanner.nextInt();
		}

		doInsertionSort(values);

		System.out.println("The sorted array is: ");
		printValues(values);
	}

	private static void doInsertionSort(int[] values) {
		int holePosition;
		int valueToInsert;
		
		for (int i = 1; i < values.length; i++) {

			/* select value to be inserted */
			valueToInsert = values[i];
			holePosition = i;

			/* locate hole position for the element to be inserted */
			while (holePosition > 0 && values[holePosition - 1] > valueToInsert) {
				values[holePosition] = values[holePosition - 1];
				--holePosition;
				System.out.println("Inserting value at " + holePosition);
				printValues(values);
			}

			/* insert the number at hole position */
			values[holePosition] = valueToInsert;
			
			printValues(values);
		}
	}

	private static void printValues(int[] values) {
		for (int counter = 0; counter < values.length; counter++) {
			System.out.print(values[counter] + " ");
		}
		System.out.println();
	}
}
