public class QuickSort {

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        // Pivot element
        int pivot = arr[high];
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at the right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println("Sorted array using Quick Sort is:");
        printArray(arr1);

        int[] arr2 = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array using Quick Sort is:");
        printArray(arr2);
    }
}
