import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] arr = {4, 1, 3, 9, 7}; // Initialize the test array
        int[] expected = {1, 3, 4, 7, 9}; // Expected result after sorting
        QuickSort.quickSort(arr, 0, arr.length - 1); // Call quickSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testQuickSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5}; // Already sorted array
        int[] expected = {1, 2, 3, 4, 5}; // Expected result is the same
        QuickSort.quickSort(arr, 0, arr.length - 1); // Call quickSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testQuickSortSingleElement() {
        int[] arr = {1}; // Single element array
        int[] expected = {1}; // Expected result is the same
        QuickSort.quickSort(arr, 0, arr.length - 1); // Call quickSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testQuickSortEmptyArray() {
        int[] arr = {}; // Empty array
        int[] expected = {}; // Expected result is the same
        QuickSort.quickSort(arr, 0, arr.length - 1); // Call quickSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testQuickSortReversedArray() {
        int[] arr = {5, 4, 3, 2, 1}; // Reversed array
        int[] expected = {1, 2, 3, 4, 5}; // Expected result after sorting
        QuickSort.quickSort(arr, 0, arr.length - 1); // Call quickSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testQuickSortWithDuplicates() {
        int[] arr = {3, 1, 2, 1, 3, 2}; // Array with duplicates
        int[] expected = {1, 1, 2, 2, 3, 3}; // Expected result after sorting
        QuickSort.quickSort(arr, 0, arr.length - 1); // Call quickSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }
}
