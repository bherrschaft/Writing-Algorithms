import java.util.ArrayList;
import java.util.List;

public class ZAlgorithm {

    // Z algorithm to find pattern in a text
    public static List<Integer> searchPattern(String text, String pattern) {
        String concat = pattern + "$" + text;
        int l = concat.length();
        int[] z = new int[l];
        computeZArray(concat, z);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < l; ++i) {
            if (z[i] == pattern.length()) {
                // Adding 1 to convert to 1-based index
                result.add(i - pattern.length() - 1);
            }
        }
        return result;
    }

    // Compute Z array
    public static void computeZArray(String str, int[] z) {
        int n = str.length();
        int L = 0, R = 0, K;

        for (int i = 1; i < n; ++i) {
            if (i > R) {
                L = R = i;
                while (R < n && str.charAt(R) == str.charAt(R - L)) {
                    R++;
                }
                z[i] = R - L;
                R--;
            } else {
                K = i - L;
                if (z[K] < R - i + 1) {
                    z[i] = z[K];
                } else {
                    L = i;
                    while (R < n && str.charAt(R) == str.charAt(R - L)) {
                        R++;
                    }
                    z[i] = R - L;
                    R--;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text1 = "batmanandrobinarebat";
        String pattern1 = "bat";
        List<Integer> occurrences1 = searchPattern(text1, pattern1);
        System.out.println("Pattern found at indices:");
        for (int index : occurrences1) {
            System.out.print((index + 1) + " ");
        }
        System.out.println();

        String text2 = "abesdu";
        String pattern2 = "edu";
        List<Integer> occurrences2 = searchPattern(text2, pattern2);
        System.out.println("Pattern found at indices:");
        if (occurrences2.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int index : occurrences2) {
                System.out.print((index + 1) + " ");
            }
        }
    }
}
