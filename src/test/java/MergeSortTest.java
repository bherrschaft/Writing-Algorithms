import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {12, 11, 13, 5, 6, 7}; // Initialize the test array
        int[] expected = {5, 6, 7, 11, 12, 13}; // Expected result after sorting
        MergeSort.mergeSort(arr, 0, arr.length - 1); // Call mergeSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testMergeSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5}; // Already sorted array
        int[] expected = {1, 2, 3, 4, 5}; // Expected result is the same
        MergeSort.mergeSort(arr, 0, arr.length - 1); // Call mergeSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testMergeSortSingleElement() {
        int[] arr = {1}; // Single element array
        int[] expected = {1}; // Expected result is the same
        MergeSort.mergeSort(arr, 0, arr.length - 1); // Call mergeSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {}; // Empty array
        int[] expected = {}; // Expected result is the same
        MergeSort.mergeSort(arr, 0, arr.length - 1); // Call mergeSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testMergeSortReversedArray() {
        int[] arr = {5, 4, 3, 2, 1}; // Reversed array
        int[] expected = {1, 2, 3, 4, 5}; // Expected result after sorting
        MergeSort.mergeSort(arr, 0, arr.length - 1); // Call mergeSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testMergeSortWithDuplicates() {
        int[] arr = {3, 1, 2, 1, 3, 2}; // Array with duplicates
        int[] expected = {1, 1, 2, 2, 3, 3}; // Expected result after sorting
        MergeSort.mergeSort(arr, 0, arr.length - 1); // Call mergeSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }
}
