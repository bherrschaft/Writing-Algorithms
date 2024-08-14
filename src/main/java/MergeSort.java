public class MergeSort {

    // Main function that sorts an array using Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) { // Base condition for recursion
            // Find the middle point
            int middle = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, middle); // Recursively sort the first half
            mergeSort(arr, middle + 1, right); // Recursively sort the second half

            // Merge the sorted halves
            merge(arr, left, middle, right); // Merge the two sorted halves
        }
    }

    // Function to merge two halves of the array
    public static void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1; // Size of the left subarray
        int n2 = right - middle; // Size of the right subarray

        // Create temporary arrays
        int[] leftArray = new int[n1]; // Array to hold the left subarray
        int[] rightArray = new int[n2]; // Array to hold the right subarray

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[left + i]; // Copy left subarray to leftArray
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[middle + 1 + j]; // Copy right subarray to rightArray

        // Merge the temporary arrays back into arr[left..right]
        int i = 0, j = 0; // Initial indexes of leftArray and rightArray
        int k = left; // Initial index of merged subarray
        while (i < n1 && j < n2) { // While there are elements in both subarrays
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i]; // Place the smaller element in the merged array
                i++; // Move to the next element in leftArray
            } else {
                arr[k] = rightArray[j]; // Place the smaller element in the merged array
                j++; // Move to the next element in rightArray
            }
            k++; // Move to the next position in the merged array
        }

        // Copy remaining elements of leftArray[], if any
        while (i < n1) {
            arr[k] = leftArray[i]; // Copy remaining elements from leftArray
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if any
        while (j < n2) {
            arr[k] = rightArray[j]; // Copy remaining elements from rightArray
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a newline for better formatting
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7}; // Example array to sort
        System.out.println("Given Array");
        printArray(arr); // Print the original array

        mergeSort(arr, 0, arr.length - 1); // Sort the array using Merge Sort

        System.out.println("\nSorted array");
        printArray(arr); // Print the sorted array
    }

    /*
     * Summary:
     * The code implements a Merge Sort algorithm to sort an array. Merge Sort is a
     * divide-and-conquer algorithm that recursively splits the array into halves,
     * sorts each half, and then merges the sorted halves back together. The main method
     * demonstrates the sorting process with an example array.
     */
}
