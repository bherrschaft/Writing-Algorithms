public class CountingSort {

    // Counting Sort function for strings
    public static String countSort(String arr) {
        int n = arr.length();
        char[] output = new char[n]; // output character array
        int[] count = new int[256];  // array to store count of each character

        // Initialize count array
        for (int i = 0; i < 256; ++i) {
            count[i] = 0;
        }

        // Store count of each character
        for (int i = 0; i < n; ++i) {
            count[arr.charAt(i)]++;
        }

        // Change count[i] so that count[i] contains the position of this character in output[]
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        // Build the output character array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr.charAt(i)] - 1] = arr.charAt(i);
            count[arr.charAt(i)]--;
        }

        // Convert output array to string and return
        return new String(output);
    }

    public static void main(String[] args) {
        String str1 = "edsab";
        System.out.println("Sorted string using Counting Sort is:");
        System.out.println(countSort(str1));

        String str2 = "geeksforgeeks";
        System.out.println("Sorted string using Counting Sort is:");
        System.out.println(countSort(str2));
    }
}
