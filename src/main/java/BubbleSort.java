public class BubbleSort {

    // Bubble Sort function
    public static void bubbleSort(int[] arr, int n) {
        // Iterate through the entire array
        for (int i = 0; i < n - 1; i++) {
            // Flag to check if any swapping happens in the current pass
            boolean swapped = false;

            // Traverse the array from 0 to n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, break
            if (!swapped) {
                break;
            }
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 1, 3, 9, 7};
        bubbleSort(arr1, arr1.length);
        System.out.println("Sorted array using Bubble Sort is:");
        printArray(arr1);

        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr2, arr2.length);
        System.out.println("Sorted array using Bubble Sort is:");
        printArray(arr2);
    }
}
