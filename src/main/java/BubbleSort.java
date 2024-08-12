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
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set swapped flag to true since a swap occurred
                }
            }

            // If no elements were swapped, the array is sorted, so break early
            if (!swapped) {
                break;
            }
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        // Iterate through the array and print each element
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline for better formatting
    }

    public static void main(String[] args) {
        // Example array 1 to sort
        int[] arr1 = {4, 1, 3, 9, 7};
        bubbleSort(arr1, arr1.length); // Sort the array
        System.out.println("Sorted array using Bubble Sort is:");
        printArray(arr1); // Print the sorted array

        // Example array 2 to sort
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr2, arr2.length); // Sort the array
        System.out.println("Sorted array using Bubble Sort is:");
        printArray(arr2); // Print the sorted array
    }
}
