public class QuickSort {

    // Quick Sort function that sorts an array between indices low and high
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) { // Base condition for recursion: ensure that there are at least two elements to sort
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high); // Partition the array and return the pivot index
            // Recursively sort the elements before and after the partition
            quickSort(arr, low, pi - 1); // Sort the elements on the left of the pivot
            quickSort(arr, pi + 1, high); // Sort the elements on the right of the pivot
        }
    }

    // Partition function that selects a pivot and partitions the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element, initially set to low - 1

        for (int j = low; j < high; j++) { // Traverse the array from low to high - 1
            // If the current element is less than or equal to the pivot
            if (arr[j] <= pivot) {
                i++; // Increment the index of the smaller element
                // Swap elements at i and j to move the smaller element to the left
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1 so that the pivot is in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the index of the pivot
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a newline for better formatting
    }

    public static void main(String[] args) {
        // Example array 1 to sort
        int[] arr1 = {4, 1, 3, 9, 7}; // Initialize an array with unsorted elements
        quickSort(arr1, 0, arr1.length - 1); // Sort the array using the quickSort function
        System.out.println("Sorted array using Quick Sort is:");
        printArray(arr1); // Print the sorted array

        // Example array 2 to sort
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Initialize another array with unsorted elements
        quickSort(arr2, 0, arr2.length - 1); // Sort the array using the quickSort function
        System.out.println("Sorted array using Quick Sort is:");
        printArray(arr2); // Print the sorted array
    }

    /*
     * Summary:
     * The code implements a Quick Sort algorithm to sort an array. Quick Sort is a
     * divide-and-conquer algorithm that partitions the array into two parts based on a
     * pivot element, and then recursively sorts the two parts. The partitioning process
     * ensures that elements on the left are smaller than the pivot, and elements on the right
     * are larger. The main method demonstrates the sorting with two example arrays.
     */
}
