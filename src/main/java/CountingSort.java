public class CountingSort {

    // Counting Sort function that sorts a string in lexicographical order
    public static String countSort(String str) {
        int n = str.length(); // Length of the string
        char[] output = new char[n]; // Array to store sorted characters
        int[] count = new int[256]; // Array to store count of characters

        // Store count of each character
        for (int i = 0; i < n; ++i) {
            count[str.charAt(i)]++;
        }

        // Modify count array to store actual positions
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        // Build the output character array
        for (int i = n - 1; i >= 0; i--) {
            output[count[str.charAt(i)] - 1] = str.charAt(i);
            count[str.charAt(i)]--;
        }

        return new String(output); // Convert the output array to a string
    }

    public static void main(String[] args) {
        String str1 = "edsab"; // Example string 1
        System.out.println("Sorted string is: " + countSort(str1)); // Sort and print

        String str2 = "geeksforgeeks"; // Example string 2
        System.out.println("Sorted string is: " + countSort(str2)); // Sort and print
    }
}
