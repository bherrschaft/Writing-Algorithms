import java.util.ArrayList;
import java.util.List;

public class ZAlgorithm {

    // Z algorithm to find pattern in a text
    public static List<Integer> searchPattern(String text, String pattern) {
        List<Integer> result = new ArrayList<>(); // List to store the indices of matches

        if (pattern.isEmpty()) { // Return an empty list if the pattern is empty
            return result;
        }

        // Concatenate pattern, special character, and text
        String concat = pattern + "$" + text; // Combine pattern and text with a special separator '$'
        int l = concat.length(); // Length of the concatenated string
        int[] z = new int[l]; // Z array to store lengths of substrings that match the prefix

        computeZArray(concat, z); // Compute the Z array using the helper function

        // Iterate through the concatenated string
        for (int i = 0; i < l; ++i) {
            // If the length of the substring matches the pattern length
            if (z[i] == pattern.length()) {
                // Add the starting index of the match to the result list
                result.add(i - pattern.length() - 1); // Adjust index to point to the correct location in the original text
            }
        }
        return result; // Return the list of matches
    }

    // Function to compute the Z array
    public static void computeZArray(String str, int[] z) {
        int n = str.length(); // Length of the string
        int L = 0, R = 0, K; // Initialize the left (L), right (R), and K pointers

        // Iterate through the string starting from the second character
        for (int i = 1; i < n; ++i) {
            if (i > R) { // Case 1: i is outside the current Z-box
                L = R = i; // Set L and R to the current position
                // Expand the Z-box as long as characters match
                while (R < n && str.charAt(R) == str.charAt(R - L)) {
                    R++; // Increase R as long as characters match
                }
                z[i] = R - L; // Set the Z value for the current position
                R--; // Adjust R for the next iteration
            } else { // Case 2: i is inside the current Z-box
                K = i - L; // Calculate the position inside the Z-box
                if (z[K] < R - i + 1) { // If Z[K] is less than the remaining interval
                    z[i] = z[K]; // Use the precomputed Z value
                } else { // If Z[K] reaches or exceeds the interval
                    L = i; // Set L to the current position
                    // Expand the Z-box again
                    while (R < n && str.charAt(R) == str.charAt(R - L)) {
                        R++; // Increase R as long as characters match
                    }
                    z[i] = R - L; // Update the Z value
                    R--; // Adjust R for the next iteration
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example 1: Find pattern "bat" in the text
        String text1 = "batmanandrobinarebat"; // Define the text to search within
        String pattern1 = "bat"; // Define the pattern to search for
        List<Integer> occurrences1 = searchPattern(text1, pattern1); // Search for the pattern in the text
        System.out.println("Pattern found at indices:");
        for (int index : occurrences1) {
            System.out.print((index + 1) + " "); // Print 1-based index (human-readable format)
        }
        System.out.println();

        // Example 2: Pattern not found
        String text2 = "abesdu"; // Define another text to search within
        String pattern2 = "edu"; // Define another pattern to search for
        List<Integer> occurrences2 = searchPattern(text2, pattern2); // Search for the pattern in the text
        System.out.println("Pattern found at indices:");
        if (occurrences2.isEmpty()) {
            System.out.println("-1"); // Print -1 if no match is found
        } else {
            for (int index : occurrences2) {
                System.out.print((index + 1) + " "); // Print 1-based index (human-readable format)
            }
        }
    }

    /*
     * Summary:
     * The code implements the Z algorithm to find all occurrences of a pattern within
     * a given text. The Z algorithm computes a Z array that represents the lengths of
     * substrings in the text that match the prefix of a pattern. The searchPattern function
     * concatenates the pattern, a special character, and the text to efficiently search for
     * the pattern within the text. The main method demonstrates the algorithm with two examples.
     */
}
