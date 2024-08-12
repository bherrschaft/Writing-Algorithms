import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {4, 1, 3, 9, 7}; // Initialize the test array
        int[] expected = {1, 3, 4, 7, 9}; // Expected result after sorting
        BubbleSort.bubbleSort(arr, arr.length); // Call bubbleSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testBubbleSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5}; // Already sorted array
        int[] expected = {1, 2, 3, 4, 5}; // Expected result is the same
        BubbleSort.bubbleSort(arr, arr.length); // Call bubbleSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testBubbleSortSingleElement() {
        int[] arr = {1}; // Single element array
        int[] expected = {1}; // Expected result is the same
        BubbleSort.bubbleSort(arr, arr.length); // Call bubbleSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testBubbleSortEmptyArray() {
        int[] arr = {}; // Empty array
        int[] expected = {}; // Expected result is the same
        BubbleSort.bubbleSort(arr, arr.length); // Call bubbleSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testBubbleSortReversedArray() {
        int[] arr = {5, 4, 3, 2, 1}; // Reversed array
        int[] expected = {1, 2, 3, 4, 5}; // Expected result after sorting
        BubbleSort.bubbleSort(arr, arr.length); // Call bubbleSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }

    @Test
    public void testBubbleSortWithDuplicates() {
        int[] arr = {3, 1, 2, 1, 3, 2}; // Array with duplicates
        int[] expected = {1, 1, 2, 2, 3, 3}; // Expected result after sorting
        BubbleSort.bubbleSort(arr, arr.length); // Call bubbleSort with the array
        assertArrayEquals(expected, arr); // Assert that the sorted array matches the expected result
    }
}
