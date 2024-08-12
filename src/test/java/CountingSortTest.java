import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountingSortTest {

    @Test
    public void testCountSort() {
        String str = "edsab"; // Test string
        String expected = "abdes"; // Expected result after sorting
        assertEquals(expected, CountingSort.countSort(str)); // Assert that the sorted string matches the expected result
    }

    @Test
    public void testCountSortAlreadySorted() {
        String str = "abcde"; // Already sorted string
        String expected = "abcde"; // Expected result is the same
        assertEquals(expected, CountingSort.countSort(str)); // Assert that the sorted string matches the expected result
    }

    @Test
    public void testCountSortEmptyString() {
        String str = ""; // Empty string
        String expected = ""; // Expected result is the same
        assertEquals(expected, CountingSort.countSort(str)); // Assert that the sorted string matches the expected result
    }

    @Test
    public void testCountSortWithDuplicates() {
        String str = "geeksforgeeks"; // String with duplicates
        String expected = "eeeefggkkorss"; // Expected result after sorting
        assertEquals(expected, CountingSort.countSort(str)); // Assert that the sorted string matches the expected result
    }

    @Test
    public void testCountSortSingleCharacter() {
        String str = "a"; // Single character string
        String expected = "a"; // Expected result is the same
        assertEquals(expected, CountingSort.countSort(str)); // Assert that the sorted string matches the expected result
    }
}
