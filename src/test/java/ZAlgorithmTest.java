import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ZAlgorithmTest {

    @Test
    public void testSearchPattern() {
        String text = "batmanandrobinarebat"; // Test text
        String pattern = "bat"; // Test pattern
        List<Integer> expected = Arrays.asList(0, 17); // Expected 0-based indices of matches
        assertEquals(expected, ZAlgorithm.searchPattern(text, pattern)); // Assert that the result matches the expected indices
    }

    @Test
    public void testSearchPatternNotFound() {
        String text = "abesdu"; // Test text where pattern is not found
        String pattern = "edu"; // Pattern that does not exist in the text
        List<Integer> expected = Arrays.asList(); // Expected result is an empty list
        assertEquals(expected, ZAlgorithm.searchPattern(text, pattern)); // Assert that the result matches the expected indices
    }

    @Test
    public void testSearchPatternEmptyText() {
        String text = ""; // Empty test text
        String pattern = "bat"; // Pattern to search
        List<Integer> expected = Arrays.asList(); // Expected result is an empty list
        assertEquals(expected, ZAlgorithm.searchPattern(text, pattern)); // Assert that the result matches the expected indices
    }

    @Test
    public void testSearchPatternEmptyPattern() {
        String text = "batmanandrobinarebat"; // Test text
        String pattern = ""; // Empty pattern
        List<Integer> expected = new ArrayList<>(); // Expected result for an empty pattern is an empty list
        assertEquals(expected, ZAlgorithm.searchPattern(text, pattern)); // Assert that the result matches the expected indices
    }

    @Test
    public void testSearchPatternWholeTextMatch() {
        String text = "batman"; // Test text that matches the pattern
        String pattern = "batman"; // Pattern that is the same as the text
        List<Integer> expected = Arrays.asList(0); // Expected result is the index 0
        assertEquals(expected, ZAlgorithm.searchPattern(text, pattern)); // Assert that the result matches the expected indices
    }
}
