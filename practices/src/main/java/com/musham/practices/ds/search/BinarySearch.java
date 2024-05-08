package com.musham.practices.ds.search;

public class BinarySearch {
    // Function to perform binary search recursively
    public static int binarySearch(int[] arr, int key, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater than mid, search in right half
            if (arr[mid] < key) {
                return binarySearch(arr, key, mid + 1, right);
            } 
            // If key is smaller than mid, search in left half
            else {
                return binarySearch(arr, key, left, mid - 1);
            }
        }

        // If key is not present in array
        return -1;
    }

    public static void main(String[] args) {
        // Test array (must be sorted)
        int[] arr = {3, 7, 12, 23, 45, 56, 89};
        // Key to search
        int key = 23;
        // Perform binary search
        int index = binarySearch(arr, key, 0, arr.length - 1);
        // Check if key is found
        if (index != -1) {
            System.out.println("Element " + key + " found at position " + (index+1));
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}

