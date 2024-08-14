public class BubbleSort {

    // Bubble Sort function that sorts an array in place
    public static void bubbleSort(int[] arr, int n) {
        // Outer loop to iterate over the entire array n-1 times
        for (int i = 0; i < n - 1; i++) {
            // Flag to check if any swapping occurs in the current pass
            boolean swapped = false;

            // Inner loop to perform the adjacent element comparison and swapping
            for (int j = 0; j < n - i - 1; j++) {
                // Compare the current element with the next
                if (arr[j] > arr[j + 1]) {
                    // Swap if the current element is greater than the next
                    int temp = arr[j]; // Store the current element in a temporary variable
                    arr[j] = arr[j + 1]; // Move the next element to the current position
                    arr[j + 1] = temp; // Move the stored current element to the next position
                    swapped = true; // Set swapped flag to true since a swap occurred
                }
            }

            // If no elements were swapped, the array is sorted, so break early
            if (!swapped) {
                break; // Exit the loop early if the array is already sorted
            }
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        // Iterate through the array and print each element
        for (int num : arr) {
            System.out.print(num + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a newline for better formatting
    }

    public static void main(String[] args) {
        // Example array 1 to sort
        int[] arr1 = {4, 1, 3, 9, 7}; // Initialize an array with unsorted elements
        bubbleSort(arr1, arr1.length); // Sort the array using the bubbleSort function
        System.out.println("Sorted array using Bubble Sort is:");
        printArray(arr1); // Print the sorted array

        // Example array 2 to sort
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Initialize another array with unsorted elements
        bubbleSort(arr2, arr2.length); // Sort the second array using the bubbleSort function
        System.out.println("Sorted array using Bubble Sort is:");
        printArray(arr2); // Print the sorted array
    }

    /*
     * Summary:
     * The code implements a Bubble Sort algorithm, which sorts an array by comparing
     * and swapping adjacent elements if they are in the wrong order. The process is
     * repeated until the array is fully sorted. The bubbleSort function handles the sorting,
     * and the printArray function prints the array. The main method demonstrates the sorting
     * with two example arrays.
     */
}
