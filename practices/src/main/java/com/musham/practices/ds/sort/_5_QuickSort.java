package com.musham.practices.ds.sort;

import java.util.Scanner;

/*
 * Best Case: O(nlog⁡n)
 * Average Case: O(nlog⁡n)
 * Worst Case: O(n2) (poor pivot selection)
 * Space Complexity: O(log⁡n)
 */

/**
 * The explanation will be as follows
 * 
 To sort below
5 3 9 2 7 6 1 4

Following are the steps:
Pivot 5
  Move left pointer until it finds greater value than pivot, hence it will stop at 9
  Move right pointer until it finds lesser value than pivot, hence it will stop at 4
  Swap two values 9 and 4

    5 3 4 2 7 6 1 9
  
  perform above steps again, i.e., left pointer at 7, right pointer at 1
  Swap 7 and 1
    5 3 4 2 1 6 7 9

  perform above steps again, i.e., left pointer at 6, right pointer at 1
  Here left pointer crossed right pointer hence swap right pointer and pivot
    1 3 4 2 5 6 7 9

  Perform recursive method for left of pivot and right of pivot i.e.,
    
    1, 3, 4, 2                     5                  6, 7, 9
     pivot 1,                                         Pivot 6
     left at 3, right at 1                            left at 7 right at 6
         in both cases left pointer crossed right pointer hence swap right pointer and pivot, here no change.
   Repeat same steps for remaining arrays

    1      3, 4, 2                 5                   6       7, 9
           Pivot 3                                             pivot 7
           left at 4, right at 2                               left at 9 right at 7
           swap 4, 2                                           No change as it crossed and right is at pivot
           
           3, 2, 4                                             7, 9

           left at 4, right at 2
           it crossed swap right and pivot
   
           2, 3, 4

  The latest array will be
    1      2          3, 4                 5                   6       7            9
                      pivot 3
                      left at 4, right at 3
                      No change as it crossed and right is at pivot

  The final array will be in sorted order
    1      2          3            4                 5                   6       7            9

 */

public class _5_QuickSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of integers to be sorted");
		int count = scanner.nextInt();

		int array[] = new int[count];
		for (int counter = 0; counter < count; counter++) {
			System.out.println("Enter the number for" + counter + "position: ");
			array[counter] = scanner.nextInt();
		}

		System.out.println("The unsorted array is: ");
		for (int counter = 0; counter < count; counter++) {
			System.out.print(array[counter] + " ");
		}

		quickSort(array, 0, array.length - 1);

		System.out.println("\nThe sorted array is: ");
		for (int counter = 0; counter < count; counter++) {
			System.out.print(array[counter] + " ");
		}
	}

	private static void quickSort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}

		int pivot = array[right];
		int pivotPoint = partition(array, left, right, pivot);
		quickSort(array, left, pivotPoint - 1);
		quickSort(array, pivotPoint + 1, right);
	}

	private static int partition(int[] array, int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {
			while (array[++leftPointer] < pivot) {

			}

			while (rightPointer >0 && array[--rightPointer] > pivot) {

			}

			if (leftPointer >= rightPointer) {
				break;
			} else {
				swap(array, leftPointer, rightPointer);
			}
		}

		swap(array, leftPointer, right);
		return leftPointer;
	}

	private static void swap(int[] array, int leftPointer, int rightPointer) {
		int temp = array[leftPointer];
		array[leftPointer] = array[rightPointer];
		array[rightPointer] = temp;
	}
}
