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
        String concat = pattern + "$" + text;
        int l = concat.length(); // Length of the concatenated string
        int[] z = new int[l]; // Z array to store lengths of substrings

        computeZArray(concat, z); // Compute the Z array

        // Iterate through the concatenated string
        for (int i = 0; i < l; ++i) {
            // If the length of the substring matches the pattern length
            if (z[i] == pattern.length()) {
                // Add the starting index of the match to the result list
                result.add(i - pattern.length() - 1);
            }
        }
        return result; // Return the list of matches
    }

    // Function to compute the Z array
    public static void computeZArray(String str, int[] z) {
        int n = str.length(); // Length of the string
        int L = 0, R = 0, K; // Initialize the left, right, and K pointers

        // Iterate through the string starting from the second character
        for (int i = 1; i < n; ++i) {
            if (i > R) { // Case 1: i is outside the current Z-box
                L = R = i; // Set L and R to the current position
                // Expand the Z-box as long as characters match
                while (R < n && str.charAt(R) == str.charAt(R - L)) {
                    R++;
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
                        R++;
                    }
                    z[i] = R - L; // Update the Z value
                    R--; // Adjust R for the next iteration
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example 1: Find pattern "bat" in the text
        String text1 = "batmanandrobinarebat";
        String pattern1 = "bat";
        List<Integer> occurrences1 = searchPattern(text1, pattern1);
        System.out.println("Pattern found at indices:");
        for (int index : occurrences1) {
            System.out.print((index + 1) + " "); // Print 1-based index
        }
        System.out.println();

        // Example 2: Pattern not found
        String text2 = "abesdu";
        String pattern2 = "edu";
        List<Integer> occurrences2 = searchPattern(text2, pattern2);
        System.out.println("Pattern found at indices:");
        if (occurrences2.isEmpty()) {
            System.out.println("-1"); // Print -1 if no match is found
        } else {
            for (int index : occurrences2) {
                System.out.print((index + 1) + " "); // Print 1-based index
            }
        }
    }
}
